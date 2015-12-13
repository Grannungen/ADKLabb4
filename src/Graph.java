import java.util.ArrayList;

/**
 * Created by tess on 2015-12-13.
 */
public class Graph {
    private ArrayList<Edge> edges = new ArrayList<Edge>();
    private int vertices;
    private int maxColor;

    public Graph(){

    }

    public void addEdge(int a, int b) {
        edges.add(new Edge(a, b));
    }

    public void setMaxColor(int maxColor) {
        this.maxColor = maxColor;
    }

    public int getMaxColor() {
        return maxColor;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public int getVertices() {
        return vertices;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }
}
