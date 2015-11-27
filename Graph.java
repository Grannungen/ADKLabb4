import java.util.ArrayList;

public class Graph{
	private ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
	int[][] adjacencyMatrix;
	private int numberEdges = 0;
	private int numberVertices;
	
	public Graph(int vertices){
		adjacencyMatrix = new int[vertices+1][vertices+1];
		numberVertices = vertices;
		for(int i = 0; i <= vertices; i++){
			adjacencyList.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int a, int b){
		adjacencyList.get(a).add(b);
		adjacencyMatrix[a][b] = 1;
		//adjacencyList.get(b).add(a);
		numberEdges++;
	}


	public ArrayList<ArrayList<Integer>> getAdjacencyList(){
		return adjacencyList;
	}
	
	public void printEdges(){
		ArrayList<Integer> list;
		for(int i = 1; i<=numberVertices; i++){
			list = adjacencyList.get(i);
			for(Integer j: list){
				System.out.println(i + " " + j);
				}		
			}
		}
	public int getVertices(){
		return numberVertices;
	}
	
	public int getEdges(){
		return numberEdges;
	}

	}
	




