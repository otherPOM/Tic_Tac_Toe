package tictactoe;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter cells: ");
        var cells = scan.nextLine();
        printGrid(cells);
    }

    private static void printGrid(String cells) {
        System.out.println("---------");
        for (int i = 0; i < 9; i += 3) {
            System.out.println("| " + cells.charAt(i) +
                    " " + cells.charAt(i + 1) +
                    " " + cells.charAt(i + 2) + " |");
        }
        System.out.println("---------");
    }
}
