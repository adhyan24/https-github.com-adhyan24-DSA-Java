import java.util.*;

public class array2d1 {
    public static boolean findindex(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found the cell (" + i + "," + j + ")");
                    return true;
                }
            }

        }
        return false;
    }

    public static void printspiral(int matrix1[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix1.length - 1;
        int endcol = matrix1.length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix1[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix1[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startcol == endrow) {
                    break;
                }
                System.out.print(matrix1[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                System.out.print(matrix1[i][startcol] + " ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }

    public static int diagonalsum(int matrix[][]) {
        int sum = 0;
        // for(int i = 0 ;i<matrix.length;i++){
        // for(int j = 0 ;j<matrix.length;j++){
        // if(i==j){
        // sum+=matrix[i][j];

        // }else if(i+j == matrix.length-1){
        // sum+=matrix[i][j];
        // }
        // }

        // }

        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - i - 1)
                sum += matrix[i][matrix.length - i - 1];
        }
        return sum;
    }

    public static boolean staircasesearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("key found at (" + row + "," + col + ")");
                return true;
            } 
            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
            
        }
        System.out.println(" not found");
            return false;
    }

    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];
        // Scanner sc = new Scanner(System.in);

        // int n = matrix.length;
        // int m = matrix[0].length;

        // for(int i = 0;i<n;i++){
        // for(int j = 0 ;j<m;j++){
        // matrix[i][j] = sc.nextInt();

        // }
        // }

        // // output
        // System.out.println("the matrix is :");
        // for(int i = 0;i<n;i++){
        // for(int j = 0 ;j<m;j++){
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // findindex(matrix, 5);

        // int matrix1[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
        // 14, 15, 16 } };
        // // printspiral(matrix1);

        // System.out.println(diagonalsum(matrix1));

        int matrix2[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 30 } };
        int key = 33;
        staircasesearch(matrix2, key);

    }

}
