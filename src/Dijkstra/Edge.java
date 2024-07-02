package Dijkstra;

public class Edge {
    private double weight;
    private Vertex startVertex;
    private Vertex endVertex;

    public Edge(double weight, Vertex startVertex, Vertex endVertex) {
        this.weight = weight;
        this.startVertex = startVertex;
        this.endVertex = endVertex;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Vertex getStartVertex() {
        return this.startVertex;
    }

    public void setStartVertex(Vertex startVertex) {
        this.startVertex = startVertex;
    }

    public Vertex getEndVertex() {
        return this.endVertex;
    }

    public void setEndVertex(Vertex endVertex) {
        this.endVertex = endVertex;
    }
}
