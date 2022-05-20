package Unit1_fundamentalsofjava.fundamentalsWrapUp;

import java.util.Scanner;

public class ticTacToeWithUserInput {
    public static void main(String[] args) {
        char[] pos = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        // look of the program in console
        //     |   |
        //  ---+---+---
        //     |   |
        //  ---+---+---
        //     |   |

        // assign pos array with array index with corresponds to keyboard as they look similar
        Scanner scanner = new Scanner(System.in);
        int input;
        char turn = 'X';
        int currentTurn=1;

        while (true) {
            do {
                System.out.print("Enter a position: ");
                input = scanner.nextInt();
            } while (pos[input - 1] == 'X' || pos[input - 1] == 'O');
            pos[input - 1] = turn;

            System.out.println("\n " + pos[6] + " | " + pos[7] + " | " + pos[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + pos[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + pos[2] + " \n");
            if (pos[0] == turn && pos[1] == turn && pos[2] == turn
                    || pos[3] == turn && pos[4] == turn && pos[5] == turn
                    || pos[6] == turn && pos[7] == turn && pos[8] == turn
                    || pos[0] == turn && pos[3] == turn && pos[6] == turn
                    || pos[1] == turn && pos[4] == turn && pos[7] == turn
                    || pos[2] == turn && pos[5] == turn && pos[8] == turn
                    || pos[0] == turn && pos[4] == turn && pos[8] == turn
                    || pos[2] == turn && pos[4] == turn && pos[6] == turn){
                System.out.println(turn + " is the WINNER.");
            break;
        }
            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }
            currentTurn++;
            if (currentTurn>9){
                System.out.println("It's a DRAW");
                break;
            }
        }
    }
}
