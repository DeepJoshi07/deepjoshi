package recursion;

public class Sudocu {
    public static boolean isnumberinrow(int board[][], int row, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isnumberincolumn(int board[][], int column, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    public static boolean isnumberinbox(int board[][], int row, int column, int number) {
        int theboxrow = row - row % 3;
        int theboxcolumn = column - column % 3;
        for (int i = theboxrow; i < theboxrow + 3; i++) {
            for (int j = theboxcolumn; j < theboxcolumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }

        }
        return false;

    }

    public static boolean isvalid(int board[][], int row, int column, int number) {
        return !isnumberinrow(board, row, number) &&
                !isnumberincolumn(board, column, number) &&
                !isnumberinbox(board, row, column, number);
    }

    public static boolean sudoku(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    for (int trynumber = 1; trynumber <= board.length; trynumber++) {

                        if (isvalid(board, i, j, trynumber)) {
                            board[i][j] = trynumber;
                            if (sudoku(board)) {
                                return true;
                            } else {
                                board[i][j] = 0;
                            }

                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int board[][] = {
                { 6, 5, 0, 3, 8, 1, 2, 0, 0 },
                { 9, 7, 2, 0, 6, 4, 0, 0, 1 },
                { 0, 0, 1, 0, 9, 0, 4, 6, 5 },
                { 5, 0, 0, 0, 4, 9, 0, 0, 3 },
                { 0, 0, 0, 0, 0, 2, 0, 4, 7 },
                { 7, 0, 9, 0, 0, 0, 6, 5, 2 },
                { 0, 0, 0, 4, 0, 5, 0, 1, 6 },
                { 0, 1, 0, 8, 2, 0, 0, 0, 0 },
                { 0, 0, 7, 0, 0, 3, 5, 0, 8 },
        };
        boolean issudoku = sudoku(board);
        System.out.println(issudoku);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
