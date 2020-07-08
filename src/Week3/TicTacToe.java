package Week3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



    public class TicTacToe {


        static Scanner sc;
        static String[] board;
        static String turn ;

        public static void main(String[] args) {
            sc = new Scanner(System.in);
            board = new String[9];
            turn = "X";
            String winner = null;
            populateEmptyBoard();
            System.out.println("Welcome to Tic Tac Toe");
            System.out.println("X's go first. Enter a slot number");
            printBoard();

            while (winner == null) {
                try {
                    int numInput = sc.nextInt();
                    if (numInput >= 1 && numInput <= 9) {

                        if (board[numInput - 1].equals(String.valueOf(numInput))) {

                            board[numInput - 1] = turn;

                            if (turn.equals("X"))
                                turn = "O";
                            else
                                turn = "X";
                              printBoard();
                            winner = checkWinner();
                        }
                        else {
                            System.out.println("Invalid input. Re-enter slot number");
                            continue;
                        }
                    } else {
                        System.out.println("Invalid input");
                        continue;
                    }


                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Re-enter slot number");
                    sc.nextLine();
                }


            }

            if (winner.equals("draw"))
            {System.out.println("Game is a Draw!");}
            else
            {System.out.println("The winner is " + winner);}
        }
        static void populateEmptyBoard() {
            for (int i = 0; i < 9; i++) {
                board[i] = String.valueOf(i + 1);
            }
        }

        static String checkWinner() {
            for (int j = 0; j < 8; j++) {
                String line = null;
                switch (j) {
                    case 0:
                        line = board[0] + board[1] + board[2];
                        break;

                    case 1:
                        ;
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

                if (line.equals("XXX"))
                    return "X";
                else if (line.equals("OOO"))
                    return "O";
            }
// tie or game not over

                for (int a = 0; a < 9; a++) {
                    if (Arrays.asList(board).contains(String.valueOf(a + 1)))
                    { break;}

                    else if (a == 8)
                        return "draw";

                }
                System.out.println(turn + "'s turn. Enter a slot number");
                return null;



        }

        static void printBoard(){
            System.out.println("/---|---|---\\");
            System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" | ");
            System.out.println("|-----------|");
            System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" | ");
            System.out.println("|-----------|");
            System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" | ");
            System.out.println("|-----------|");
            System.out.println("/---|---|---\\");
    }

}
