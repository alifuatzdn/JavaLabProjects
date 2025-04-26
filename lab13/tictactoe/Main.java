package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Board board = new Board();

        System.out.println(board);
        while (!board.isEnded()) {

            int player = board.getCurrentPlayer();
            int row = 0;
            int col = 0;
            boolean invalidRow;
            boolean invalidCol;

            do {
            System.out.print("Player " + player + " enter row number:");
                try {
                    row = Integer.valueOf(reader.nextLine());
                    invalidRow = false;
                }
                catch (NumberFormatException nfe) {
                    System.out.println("Invalid Integer");
                    invalidRow = true;
                }
            }
            while (invalidRow);

            do {
                System.out.print("Player " + player + " enter column number:");
                try {
                    col = Integer.valueOf(reader.nextLine());
                    invalidCol = false;
                }
                catch (NumberFormatException nfe) {
                    System.out.println("Invalid Integer");
                    invalidCol = true;
                }
            }
            while (invalidCol);

            try {
                board.move(row, col);
                System.out.println(board);
            }
            catch (InvalidMoveException ime) {
                System.out.println(ime.getMessage());
            }
        }
        reader.close();
    }
}
