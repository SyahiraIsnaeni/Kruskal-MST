public class GraphApp {

    public static void main(String[] args) {

        Kruskal_impl kruskalMST = new Kruskal_impl();
        Graph graph = new Graph(6);

        System.out.println("Graph :");
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 9);
        graph.addEdge(0, 5, 15);
        graph.addEdge(1, 2, 8);
        graph.addEdge(1, 3, 10);
        graph.addEdge(2, 3, 6);
        graph.addEdge(2, 4, 12);
        graph.addEdge(2, 5, 20);
        graph.addEdge(3, 4, 7);
        graph.addEdge(4, 5, 18);

        graph.printGraph();

        System.out.println("\nKruskal MST :");
        Graph mst_1 = kruskalMST.kruskal(graph);
        mst_1.printGraph();
    }
}
