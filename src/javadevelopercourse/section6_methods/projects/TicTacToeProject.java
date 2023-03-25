package javadevelopercourse.section6_methods.projects;

/**
 * @author john-michael.obrien
 * @since 2/3/23
 *
 * //TODO
 */
public class TicTacToeProject {
    public static void main(String[] args) {
        String[][] ticTacToe = new String[3][3];
        runGame();
    }

    public static void runGame() {

    }

    public static void initializeGame(String[][] board) {

    }

    public static void printCurrentBoard(String[][] board) {

    }

    public static void getUserInput(boolean xTurn, String[][] board) {

    }

    public static boolean isCellAlreadyOccupied(int row, int col, String[][] board) {
        return false;
    }

    public static String getWinner(String[][] board) {
        return board.toString();
    }

    public static boolean isBoardFull(String[][] board) {
        return false;
    }
}
