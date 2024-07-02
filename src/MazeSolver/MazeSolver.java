package MazeSolver;

public class MazeSolver {
    private int [] [] mazeMap;
    private boolean [] [] visited;
    private int startPositionCol;
    private int startPositionRow;

    public MazeSolver (int[] [] mazeMap, int startPositionRow, int startPositionCol) {
        this.mazeMap = mazeMap;
        this.visited = new boolean[mazeMap.length][mazeMap.length];
        this.startPositionCol = startPositionCol;
        this.startPositionRow = startPositionRow;
    }

    public void findWayOut() {
        try {
            dfs(startPositionRow, startPositionCol);
            System.out.println("No solution found...");
        } catch (Exception e) {
            System.out.println("Route found to exit!!!");
        }
    }

    private void dfs(int rowIndex, int colIndex) {
        System.out.println("Visiting row=" + (rowIndex+1) + ", column=" +(colIndex+1));

        if(this.mazeMap[rowIndex][colIndex]==3) {
            //if we have found the 3 'exit', break out the iteration with an exception
            throw new RuntimeException();
        }

        int endOfMap = this.mazeMap.length-1;

        if(visited[rowIndex][colIndex]) {//Node has already been visited, just skip it
            return;      
        } else if(rowIndex<0 || rowIndex>=endOfMap) { //out of map
            return;
        } else if(colIndex<0 || colIndex>=endOfMap) { //out of map
            return;
        } else if(this.mazeMap[rowIndex][colIndex]==1) { // It is a wall
            return;
        } else {
            this.visited[rowIndex][colIndex] = true; //set the current node to visited
            dfs(rowIndex+1, colIndex); // going down
            dfs(rowIndex, colIndex+1); // going right
            dfs(rowIndex, colIndex-1); // going left
            dfs(rowIndex-1, colIndex); // going up
        }
    }
}
