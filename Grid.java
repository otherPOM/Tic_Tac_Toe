package tictactoe;

public class Grid {
    private String cells;
    private char[] grid;
    private boolean xWon;
    private boolean oWon;

    public Grid(String cells) {
        this.cells = cells;
        grid = cells.toCharArray();
        xWon = false;
        oWon = false;
    }

    public void print() {
        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + grid[i] +
                    " " + grid[i + 1] +
                    " " + grid[i + 2] + " |");
        }
        System.out.println("---------");
    }

    public GameState analyze() {
        if (oneSideTooMany()) {
            return GameState.IMPOSSIBLE;
        }

        findWinner();
        if (xWon && oWon) {
            return GameState.IMPOSSIBLE;
        }
        if (xWon) {
            return GameState.X_WINS;
        }
        if (oWon) {
            return GameState.O_WINS;
        }

        return cells.contains("_") ? GameState.GAME_NOT_FINISHED : GameState.DRAW;
    }

    private boolean oneSideTooMany() {
        return Math.abs(cells.chars().filter(c -> c == 'X').count() -
                cells.chars().filter(c -> c == 'O').count()) > 1;
    }

    private void findWinner() {
        for (int i = 0; i < 9; i += 3) {
            if (grid[i] == grid[i + 1] && grid[i + 1] == grid[i + 2]) {
                if (grid[i] == 'O') {
                    oWon = true;
                } else if (grid[i] == 'X') {
                    xWon = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (grid[i] == grid[i + 3] && grid[i + 3] == grid[i + 6]) {
                if (grid[i] == 'O') {
                    oWon = true;
                } else if (grid[i] == 'X') {
                    xWon = true;
                }
            }
        }
        if (grid[0] == grid[4] && grid[4] == grid[8]) {
            if (grid[0] == 'O') {
                oWon = true;
            } else if (grid[0] == 'X') {
                xWon = true;
            }
        }
        if (grid[2] == grid[4] && grid[4] == grid[6]) {
            if (grid[2] == 'O') {
                oWon = true;
            } else if (grid[2] == 'X') {
                xWon = true;
            };
        }
    }
}
