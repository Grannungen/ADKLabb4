import java.io.*;
import java.util.*;

public class Main {
	Graph graph;
	private int colors;

	public Main(){

	}


	public static void main(String args[]) throws FileNotFoundException{
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		//Scanner scanner = new Scanner(new FileReader("test.txt"));

		Main main = new Main();
		main.readInput(scanner);

	}

	public void readInput(Scanner scanner){
		int vertices = scanner.nextInt();
		graph = new Graph(vertices);
		int edges = scanner.nextInt();
		int colors = scanner.nextInt();
		for(int role = 1; role<=edges; role++){
			graph.addEdge(scanner.nextInt(), scanner.nextInt());
		}

		System.out.println(vertices);

	}


}