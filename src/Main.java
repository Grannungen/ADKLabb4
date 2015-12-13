import java.io.*;
import java.util.*;

public class Main {
	
	private RolePlay rolePlay; 
	private int colors;

	public Main(){
		rolePlay = new RolePlay();
	}


	public static void main(String args[]) throws FileNotFoundException{
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		//Scanner scanner = new Scanner(new FileReader("test2.txt"));

		Main main = new Main();
		Graph graph = main.readGraphColoringInput(scanner);
		main.reduceGraphColoring(graph);
		main.printRolePlay();
	}

	public Graph readGraphColoringInput(Scanner scanner){
		Graph graph = new Graph();
		int vertices = scanner.nextInt();
		int edges = scanner.nextInt();
		int colors = scanner.nextInt();

		graph.setVertices(vertices);
		graph.setMaxColor(colors);
		int a, b;
		for(int edge = 1; edge<=edges; edge++){
			a = scanner.nextInt();
			b = scanner.nextInt();
			if(a!=b){
				graph.addEdge(a, b);
			}
		}
		return graph;
	}

	public void reduceGraphColoring(Graph graph){
		ArrayList<Edge> edges = graph.getEdges();
		rolePlay.setRoles(graph.getVertices()+ 2);
		rolePlay.setActors(colors + 1);
		rolePlay.setScenes(edges.size() + graph.getVertices()+1);
		for(Edge e: edges){
			rolePlay.addScene(e);
		}
		for(int i = 1; i<=graph.getVertices(); i++){
			rolePlay.addScene(new Edge(i, graph.getVertices()+1));
		}
		rolePlay.addScene(new Edge(graph.getVertices()+1, graph.getVertices()+2));
	}

	public void printRolePlay(){
		rolePlay.printShow();
	}

}
