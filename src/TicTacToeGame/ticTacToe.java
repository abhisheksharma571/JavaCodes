package TicTacToeGame;

import java.util.Scanner;


public class ticTacToe {
    static String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
    static String turn = "X";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String winner = null;
        printBoard();

        while (winner == null) {
            System.out.println("Turn " + turn + ", choose a slot:");
            int numInput;
            try {
                numInput = scanner.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }
            if (board[numInput-1].equals("X") || board[numInput-1].equals("O")) {
                System.out.println("Slot already taken; re-enter slot number:");
                continue;
            }
            board[numInput-1] = turn;
            // Check if there is a winner
            winner = checkWinner();
            // If there is a winner, end the game
            if (winner != null) {
                break;
            }
            if (turn.equals("X")) {
                turn = "O";
            } else {
                turn = "X";
            }
            printBoard();
        }
        System.out.println("Congratulations! " + winner + "'s have won.");
    }

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            } else {
                return null;
            }
        }

        for (int a = 0; a < 9; a++) {
            if (board[a].equals(String.valueOf(a+1))) {
                return null;
            }
        }
        return "draw";
    }

    static void printBoard() {
        System.out.println("/---|---|---\\");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("/---|---|---\\");
    }
}