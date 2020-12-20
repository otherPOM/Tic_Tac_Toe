package tictactoe;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        var cells = scan.nextLine();
        var grid = new Grid(cells);
        grid.print();
        System.out.println(grid.analyze().getMessage());
    }
}
