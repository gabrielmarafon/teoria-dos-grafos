package MazeSolver;

public class App {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("src/MazeSolver/map.txt", 15, 15);
        fileReader.parseFile();
        
        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),
                                                fileReader.getStartPositionRow(),
                                                fileReader.getStartPositionCol()
                );
        mazeSolver.findWayOut();
    }
}