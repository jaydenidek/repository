public class hanoi {
    static int counter = 0;
    public static void main(String[] args){
        String[][] board = new String[8][3];

        for (int row = 0; row < 8; row++){
            for (int col = 0; col < 3; col++){
                board[row][col] = "0";
            }
        }

        board[1][0] = "1";
        board[2][0] = "2";
        board[3][0] = "3"; 
        board[4][0] = "4";
        board[5][0] = "5";
        board[6][0] = "6";
        board[7][0] = "7";
        hanoi(7, 0, 1, 2, board);
        
    }
    static String[][] hanoi(int num, int source, int destination, int auxiliary, String[][] board){
        
        if(num == 0){
            return board;
        }
           hanoi(num-1, source, auxiliary, destination, board);
            for(int r = 0; r < board.length; r++){
                if(Integer.parseInt(board[r][source]) > 0){
                    move(r, source, destination, board);
                    counter++;
                    vis(board);
                    System.out.println(counter);
                    break;
                }
            }
            hanoi(num - 1, auxiliary, destination, source, board);
            return board;
        }
        
    

    static String[][] move(int sourceRow, int sourceCol, /*int destinationRow,*/ int destinationCol, String[][] board){
        for(int row = 0; row < board.length; row++){
            if(Integer.parseInt(board[row][destinationCol]) > 0){
                if(Integer.parseInt(board[sourceRow][sourceCol]) < Integer.parseInt(board[row][destinationCol])){
                    board[row - 1][destinationCol] = board[sourceRow][sourceCol];
                    board[sourceRow][sourceCol] = "0";
            
                }
                return board;
            }
            
            
        }
        board[board.length - 1][destinationCol] = board[sourceRow][sourceCol];
            board[sourceRow][sourceCol] = "0";
            return board;

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

//If the destination column is completely empty, place the disk in row 7.
//Remove the disk from the source position and place it at the destination position.
