package CycleDetectionDFS;

import java.util.List;

public class CycleDetection {
    public void detectCycle(List<Vertex> vertexList) {
        for (Vertex v : vertexList) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
    }

    public void dfs(Vertex vertex) {
        System.out.println("\nDFS on vertex: " + vertex);
        vertex.setBeingVisited(true);

        for (Vertex v : vertex.getAdjacencyList()) {
            System.out.println("Visiting the neighbors of vertex: " + vertex + ", vertex " + v);

            if (v.isBeingVisited()) {
                System.out.println("\n<<There is a backward edge, cycle detected!>>");
                return;
            }

            if (!v.isVisited()) {
                dfs(v);
            }

        }

        System.out.println("Set vertex " + vertex + " setBeingVisited(false) and setVisited(true)");
        vertex.setBeingVisited(false);
        vertex.setVisited(true);
    }
}
