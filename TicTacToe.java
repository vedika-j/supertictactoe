import java.util.*;

    public class TicTacToe {

        static String[] board;
        static String turn;


        // CheckWinner method will
        // decide the combination
        // of three box given below.
        static String checkWinner() {
            for (int a = 0; a < 8; a++) {
                String line = switch (a) {
                    case 0 -> board[0] + board[1] + board[2];
                    case 1 -> board[3] + board[4] + board[5];
                    case 2 -> board[6] + board[7] + board[8];
                    case 3 -> board[0] + board[3] + board[6];
                    case 4 -> board[1] + board[4] + board[7];
                    case 5 -> board[2] + board[5] + board[8];
                    case 6 -> board[0] + board[4] + board[8];
                    case 7 -> board[2] + board[4] + board[6];
                    default -> null;
                };

                //For X winner
                if (line.equals("XXX")) {
                    return "X";
                }

                // For O winner
                else if (line.equals("OOO")) {
                    return "O";
                }
            }

            for (int a = 0; a < 9; a++) {
                if (Arrays.asList(board).contains(
                        String.valueOf(a + 1))) {
                    break;
                } else if (a == 8) {
                    return "draw";
                }
            }

            // To enter the X Or O at the exact place on board.
            System.out.println(
                    turn + "'s turn; enter a slot number to place "
                            + turn + " in:");
            return null;
        }

        // To print out the board.
	/*
	 1 | 2 | 3
	-----------
	 4 | 5 | 6
	-----------
	7 | 8 | 9
	*/

        static void printBoard() {
            System.out.println(" ");
            System.out.println("| " + board[0] + " | "
                    + board[1] + " | " + board[2]
                    + " |");
            System.out.println("|-----------|");
            System.out.println("| " + board[3] + " | "
                    + board[4] + " | " + board[5]
                    + " |");
            System.out.println("|-----------|");
            System.out.println("| " + board[6] + " | "
                    + board[7] + " | " + board[8]
                    + " |");
            System.out.println(" ");
        }


        public static void game() {

            board = new String[9];
            turn = "X";
            String winner = null;
            int extraChances = 0; // Track the number of extra chances granted.

            for (int a = 0; a < 9; a++) {
                board[a] = String.valueOf(a + 1);
            }

            System.out.println("Battle for the " + (SuperTicTacToe.input) + " square");
            printBoard();

            System.out.println("X will play first. Enter a slot number to place X in:");

            chance(null);

        }

        public static void chance(String winner) {
            Scanner in = new Scanner(System.in);
            int extraChance = 1;
            while (winner == null) {
                int numInput;
                int numInputExtra = 0;

                // Exception handling.
                try {
                    numInput = in.nextInt();
                    numInputExtra=numInput;
                    if (!(numInput > 0 && numInput <= 9) && (numInput != 2023)) {
                        System.out.println("Invalid input; re-enter slot number:");
                        continue;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
                if (numInput == 2023) {
                    System.out.println("Cheat activated enter your two places");
                    extraChance = 1;
                    numInput=in.nextInt();
                    numInputExtra = in.nextInt();
                }

                for (int i = 0; i < extraChance; i++) {
                    if (board[numInput - 1].equals(String.valueOf(numInput))) {
                        board[numInput - 1] = turn;
                    }
                    if (board[numInputExtra - 1].equals(String.valueOf(numInputExtra))) {
                        board[numInputExtra - 1] = turn;
                    }
                    else {
                        System.out.println("Slot already taken; re-enter slot number:");
                    }


                    if (turn.equals("X")) {
                        turn = "O";
                    } else {
                        turn = "X";
                    }

                    printBoard();
                    winner = checkWinner();
                    }

                }

                // If no one wins or loses from both player X and O.
                if (winner.equalsIgnoreCase("draw")) {
                    System.out.println("It's a draw! Thanks for playing.");
                } else {
                    System.out.println("Congratulations! " + winner + "'s has won the square " + (SuperTicTacToe.input));
                }
            }
        }



