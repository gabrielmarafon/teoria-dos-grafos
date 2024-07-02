package BellmanFord;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        List<Vertex> vertexList = new ArrayList<>();
        Vertex vs = new Vertex("S");
        Vertex vr = new Vertex("R");
        Vertex vt = new Vertex("T");
        Vertex vu = new Vertex("U");

        vertexList.add(vs);
        vertexList.add(vr);
        vertexList.add(vt);
        vertexList.add(vu);

        List<Edge> edgeList = new ArrayList<>();
        edgeList.add(new Edge(3, vs, vt));
        edgeList.add(new Edge(1, vs, vu));
        edgeList.add(new Edge(3, vr, vs));
        edgeList.add(new Edge(5, vr, vu));
        edgeList.add(new Edge(7, vr, vt));
        edgeList.add(new Edge(1, vu, vt));

        BellmanFord bellmanFord = new BellmanFord(vertexList, edgeList);
        bellmanFord.bellmanFord(vs);

        for (Vertex vertex : vertexList) {
            System.out.println("Shortest path from S to " + vertex.getName() + ": " + bellmanFord.getShortestPathTo(vertex));
        }
    }
}

