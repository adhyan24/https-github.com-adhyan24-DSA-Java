import java.util.*;

public class Backtracking {
    public static void changearr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printarr(arr);
            return;
        }
        // recuresion
        arr[i] = val;
        changearr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 1;
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();
    }

    public static void subsetstring(String s, String ans, int i) {
        // base case
        if (i == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;

        }
        // recursion
        subsetstring(s, ans + s.charAt(i), i + 1);
        // yess chioice
        subsetstring(s, ans, i + 1);
    }

    public static void findpermuataion(String str, String ans) {
        // base case

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde"=>"ab"+"de = "abde"
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findpermuataion(newstr, ans + curr);
        }
    }

    public static boolean issafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }

        }
        // left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nqueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            printBoard(board);
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueens(board, row + 1); // funstion call
                board[row][j] = 'x'; // backtracking step
            }
        }
    }

    static int count = 0;

    public static void countnqueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            count++;
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                countnqueens(board, row + 1); // funstion call
                board[row][j] = 'x'; // backtracking step
            }
        }
    }

    public static void printBoard(char board[][]) {

        System.out.println("------chess board-------");
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean onenqueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                if (onenqueens(board, row + 1)) {
                    return true;
                } // funstion call
                board[row][j] = 'x'; // backtracking step
            }
        }
        return false;
    }

    public static int gridways(int i, int j, int n, int m) {
        // base case
        if (i == m - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == n) {
            return 0;

        }

        int w1 = gridways(i + 1, j, n, m);
        int w2 = gridways(i, j + 1, n, m);
        return w1 + w2;

    }

    public static boolean issafesudoku(int sudoku[][], int row, int col, int digit) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // row
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean sudokusolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }

        // recursion
        int nextrow = row, nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextrow, nextcol);

        }

        for (int digit = 1; digit <= 9; digit++) {
            if (issafesudoku(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokusolver(sudoku, nextrow, nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];

        // changearr(arr, 0, 1);
        // printarr(arr);

        // String s = "abc";
        // subsetstring(s, "", 0);

        // findpermuataion(s, "");

        int n = 4;

        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nqueens(board, 0);

        System.out.println();
        // countnqueens(board, 0);
        // System.out.println("total no. of ways imn nqueens " + count);

        // if (onenqueens(board, 0)) {
        // System.out.println("solution is posiible");
        // printBoard(board);
        // } else {
        // System.out.println("solution is not possible");
        // }

        // int n1 = 3, m =3;

        // System.out.println(gridways(0, 0, n1, m));

        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                           { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                           { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                           { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                           { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                           { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                           { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                           { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                           { 8, 2, 7, 0, 0, 9, 0, 1, 3 } 
                        };
        sudokusolver(sudoku, 0, 0);

        for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
        System.out.print(sudoku[i][j] + " ");
        }
        System.out.println();
        }
    }

}
