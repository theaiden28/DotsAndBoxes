package game;

public class GameBoard {
    private int blueScore;
    private Box[][] boxes;
    private int columns;
    private Dot[][] dots;
    private Lines lines;
    private int moves;
    private Player player;
    private int redScore;
    private int rows;

    public GameBoard(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }

    public boolean gameOver(){

    }

    public boolean isLineValid(int row1, int column1, int row2, int column2){

    }

    public void makeMove(int row1, int column1, int row2, int column2){

    }

    public String toString() {

    }

    public Player whoseTurn() {

    }

}
