public class Edge implements Comparable{

    private int source;
    private int destination;
    private int weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int getSource() {

        return source;
    }

    public int getDestination() {

        return destination;
    }

    public int getWeight() {

        return weight;
    }

    public int compareTo(Object o) {
        Edge other = (Edge) o;
        return Integer.compare(this.weight, other.weight);
    }

    public String toString() {

        return "Edge (" + source + "-" + destination + ")" + ", weight = " + weight ;
    }
}
