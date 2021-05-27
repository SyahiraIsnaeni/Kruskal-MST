import java.util.Iterator;
import java.util.PriorityQueue;

public class Kruskal_impl {
    public Graph kruskal(Graph g) {
        Graph mst = new Graph(g.getvertexCount());
        boolean[] marked = new boolean[g.getvertexCount()];

        PriorityQueue<Edge> edges = new PriorityQueue<Edge>();
        for (int i = 0; i < g.getvertexCount(); i++) {
            Iterator<Edge> it = g.adjacencyList.iterator();
            while (it.hasNext()) {
                edges.add(it.next());
            }
        }

        while (!edges.isEmpty()) {

            Edge temp = edges.remove();

            if (!marked[temp.getDestination()]) {
                if (!mst.hasEdge(temp)) {
                    mst.addEdge(temp);
                    marked[temp.getDestination()] = true;
                }
            }
        }
        return mst;
    }
}

