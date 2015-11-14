import java.io.*;
import java.util.*;

public class Main {



	public Main(){

	}


	public static void main(String args[]) throws FileNotFoundException{

		Scanner text = new Scanner(new FileReader("test.txt"));
		int numberOfVertices = text.nextInt();
		int numberOfEdges = text.nextInt();
		int numberOfColors = text.nextInt();
		Graph graph = new Graph(numberOfVertices);
		for (int i = 0; i< numberOfEdges; i++) {
			int v1 = text.nextInt();
			int v2 = text.nextInt();
			graph.addEdge(v1,v2);
			
		}
		graph.printEdges();

	}
}