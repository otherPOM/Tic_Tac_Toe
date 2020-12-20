package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        var cells = scan.nextLine();
        if (cells.length() != 9) {
            throw new RuntimeException();
        }
        var grid = new Grid(cells);
        grid.print();

        while (true) {
            System.out.print("Enter the coordinates: ");
            try {
                var x = scan.nextInt();
                var y = scan.nextInt();
                if (grid.move(x, y)) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("You should enter numbers!");
            }
        }
        grid.print();
//        System.out.println(grid.analyze().getMessage());
    }
}
