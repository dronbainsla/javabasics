package Unit1_fundamentalsofjava.fundamentalsWrapUp;

public class ticTacToeWithoutUserInput {
    public static void main(String[] args) {
        char[] pos={'x','0','x','0',' ',' ',' ','x',' '};
        // look of the program in console
        //     |   |
        //  ---+---+---
        //     |   |
        //  ---+---+---
        //     |   |

        // assign pos array with array index with corresponds to keyboard as they look similar
        System.out.println(" "+ pos[6]+" | " +pos[7]+" | " +pos[8] +" ");
        System.out.println("---+---+---");
        System.out.println(" "+ pos[3]+" | " +pos[4]+" | " +pos[5] +" ");
        System.out.println("---+---+---");
        System.out.println(" "+ pos[0]+" | " +pos[1]+" | " +pos[2] +" ");
    }
}
