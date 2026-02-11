public class array2d2 {
    public static void timeskey(int arr[][], int key) {
        int count = 0;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (key == arr[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void rowsum(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[1][i];
        }
        System.out.println(" the sum of second row is:" + sum);

    }

    public static void printmatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        // {
        // int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        // int key = 7;
        // timeskey(arr, key);
        // }

        // {
        // int arr1[][] = { {1,4,9} , {11,4,3},{2,2,3}};
        // rowsum(arr1);
        // }

        {
           
            int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };
            int row = matrix.length;
            int column = matrix[0].length;
            // Display original matrix
            System.out.println("the original array is :");
            printmatrix(matrix);
            System.out.println();
            // Transpose the matrix
            int[][] transpose = new int[column][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            } // print the transposed matrix
            System.out.println("the transepose array is:");
            printmatrix(transpose);
        }

    }
}
