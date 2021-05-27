import java.util.Iterator;
import java.util.PriorityQueue;

public class Graph {
    private int vertexCount;
    public PriorityQueue<Edge> adjacencyList;

    public int getvertexCount() {

        return vertexCount;
    }

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjacencyList = new PriorityQueue<Edge>(vertexCount);
    }

    public void addEdge(int start, int end, int weight) {
        Edge e = new Edge(start, end, weight);
        adjacencyList.add(e);
    }

    public void addEdge(Edge e) {

        adjacencyList.add(e);
    }

    public boolean hasEdge(Edge edge) {

        return adjacencyList.contains(edge.getSource());
    }

    public void printGraph() {
        PriorityQueue<Edge> edges = adjacencyList;
        Iterator<Edge> it = edges.iterator();
        for (int j = 0; j < edges.size(); j++) {
            System.out.println(it.next());
        }
    }
}
