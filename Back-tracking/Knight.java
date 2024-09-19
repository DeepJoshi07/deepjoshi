public class Knight {
    public static boolean isvalidplace(int[][] board, int row, int column, int curr_row, int curr_col) {
        
        if ((curr_row + 2 == row) && (curr_col - 1 == column)) {
            if (board[row][column] == 0) {
                return true;
            }

        } else if ((curr_row + 2 == row) && (curr_col + 1 == column)) {
            if (board[row][column] == 0) {
                return true;
            }
        } else if ((curr_row - 2 == row) && (curr_col + 1 == column)) {
            if (board[row][column] == 0) {
                return true;
            }
        } else if ((curr_row - 2 == row) && (curr_col - 1 == column)) {
            if (board[row][column] == 0) {
                return true;
            }
        } else if ((curr_row + 2 == row) && (curr_col - 1 == column)) {
            if (board[row][column] == 0) {
                return true;
            }
        } else if ((curr_row + 1 == row) && (curr_col - 2 == column)) {
            if (board[row][column] == 0) {
                return true;
            }
        } else if ((curr_row - 1 == row) && (curr_col - 2 == column)) {
            if (board[row][column] == 0) {
                return true;
            }
        } else if ((curr_row + 1 == row) && (curr_col + 2 == column)) {
            if (board[row][column] == 0) {
                return true;
            }
        } else if ((curr_row - 1 == row) && (curr_col + 2 == column)) {
            if (board[row][column] == 0) {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void chessboard(int[][] board, int size) {
        if (board.length < size) {
            return;
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
              int curr_row = i;
              int curr_col = j;
                if(i < 0 || j < 0){
                    return chessboard(board,size);
              }
                
            }
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }
        };
        int size = 1;
    }

}
