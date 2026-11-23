public class hanoi {
    public static void main(String[] args){
        String[][] board = new String[8][3];

        for (int row = 0; row < 8; row++){
            for (int col = 0; col < 3; col++){
                board[row][col] = "|";
            }
        }

        board[1][0] = "1";
        board[2][0] = "2";
        board[3][0] = "3"; 
        board[4][0] = "4";
        board[5][0] = "5";
        board[6][0] = "6";
        board[7][0] = "7";
        vis(board);

        for (int row = 0; row < board.length; row++){
            for (int n = 0; n < board[row].length; n++){
                int destination = 0;
                int source = 1;
                int auxiliary = 2;
                hanoi(n, source, destination, auxiliary, board);
            }
        }
    }
    static void hanoi(int num, int source, int destination, int auxiliary, String [][] board){
        if(num == 0){
            return;
        }
        if(num > 0){
            for(int row = 0; row < board.length; row++){
                for(int col = 0; col < board[row].length; col++){
                    if(!board[row][col].equals("|")){
                        String disk = board[row][col];
                        board[row][col] = "|";
                    }
                }
            }
        }
    }

    static void move(int Source, int destination, String[][] board){

    }

    static void vis(String[][] board){
        for (int row = 0; row < board.length; row++){
            for(int column = 0; column < board[row].length; column++){
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }
}

//Declare board as a static class variable so hanoi, move, and vis can all access it.
//Keep the existing initialization and disk placement.
//In main, call hanoi(7, 0, 2, 1) once.
//Make hanoi accept int num, int source, int destination, int auxiliary.
//Inside hanoi, perform the three recursive actions:
//Move num - 1 disks from source to auxiliary.
//Move one disk from source to destination.
//Move num - 1 disks from auxiliary to destination.
//Create a separate move method for the actual one-disk transfer.
//Inside move, scan rows from 0 upward to find the first occupied position in the source column; that is the top disk.
//Scan rows from 7 downward to find the lowest occupied position in the destination column. The destination row is the row immediately above that position.
//If the destination column is completely empty, place the disk in row 7.
//Remove the disk from the source position and place it at the destination position.