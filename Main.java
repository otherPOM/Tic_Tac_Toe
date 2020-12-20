package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        var cells = "_________";
        var grid = new Grid(cells);
        grid.print();

        var xMove = true;
        while (true) {
            System.out.print("Enter the coordinates: ");
            try {
                var x = scan.nextInt();
                var y = scan.nextInt();
                if (x > 3 || x < 1 || y > 3 || y < 1) {
                    System.out.println("Coordinates should be from 1 to 3!");
                    continue;
                }
                if (grid.isOccupied(x, y)) {
                    System.out.println("This cell is occupied! Choose another one!");
                    continue;
                }
                char c = xMove ? 'X' : 'O';
                grid.move(x, y, c);
                xMove = !xMove;
                grid.print();
                var state = grid.analyze();
                if (state != GameState.GAME_NOT_FINISHED) {
                    System.out.println(state.getMessage());
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
            }
        }
    }
}
