package Graph;

public class testGraph {
    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1, 2);
        g.addEdge(1, 2, 3);
        g.addEdge(2, 1, 3);
        g.addEdge(3, 1, 2);
        g.shortestPathUG(0);
    }
}