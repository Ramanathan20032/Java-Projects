package TicTacToeGame;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        char[] pos = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

        System.out.println("--- TIC TAC TOE---");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int input;
        char turn = 'X';
        int count = 1;

        while (true){
            do {
                System.out.println(turn + " turn...");
                System.out.print("Enter the position : ");
                input = sc.nextInt();
            }while (pos[input - 1] == 'X' || pos[input - 1] == 'O');

            pos[input-1] = turn;

            System.out.println("    "+pos[6]+" | "+pos[7]+" | "+pos[8]+" ");
            System.out.println("   ---+---+---");
            System.out.println("    "+pos[3]+" | "+pos[4]+" | "+pos[5]+" ");
            System.out.println("   ---+---+---");
            System.out.println("    "+pos[0]+" | "+pos[1]+" | "+pos[2]+" ");

            if ( (pos[0] == turn && pos[1] == turn && pos[2] == turn)
                    || (pos[3] == turn && pos[4] == turn && pos[5] == turn)
                    || (pos[6] == turn && pos[7] == turn && pos[8] == turn)
                    || (pos[6] == turn && pos[3] == turn && pos[0] == turn)
                    || (pos[7] == turn && pos[4] == turn && pos[1] == turn)
                    || (pos[8] == turn && pos[5] == turn && pos[2] == turn)
                    || (pos[6] == turn && pos[4] == turn && pos[2] == turn)
                    || (pos[8] == turn && pos[4] == turn && pos[0] == turn)){
                System.out.println();
                System.out.println(turn + " is the Winner.");
                break;
            }

            if(turn == 'X'){
                turn = 'O';
            }
            else if(turn == 'O'){
                turn = 'X';
            }
            if(count > 9){
                System.out.println("Game is Drawn");
                break;
            }
        }
    }
}
