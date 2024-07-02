package Dijkstra;

public class App {
    public static void main(String[] args) {
        Vertex va = new Vertex("A");
        Vertex vb = new Vertex("B");
        Vertex vc = new Vertex("C");
        Vertex vd = new Vertex("D");
        Vertex ve = new Vertex("E");
        Vertex vf = new Vertex("F");
        Vertex vg = new Vertex("G");
        Vertex vh = new Vertex("H");


        va.addNeighbor(new Edge(12, va, vb));
        va.addNeighbor(new Edge(4, va, vc));

        vb.addNeighbor(new Edge(5, vb, vd));
        vb.addNeighbor(new Edge(3, vb, ve));

        vc.addNeighbor(new Edge(2, vc, vd));
        vc.addNeighbor(new Edge(6, vc, vf));

        vd.addNeighbor(new Edge(8, vd, vg));

        ve.addNeighbor(new Edge(7, ve, vh));

        vf.addNeighbor(new Edge(5, vf, vg));

        vg.addNeighbor(new Edge(3, vg, vh));

        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();

        dijkstraAlgorithm.computePaths(va);

        System.out.println("Distância até H: " + vh.getDistance());
        System.out.println("Rota mais curta de A até H: " + dijkstraAlgorithm.getShortestPathTo(vh));
    }
}

