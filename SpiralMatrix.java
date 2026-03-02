class SpiralMatrix {
    public List<Integer> spiralOrder(int[][ arr) {
        List<Integer> list = new ArrayList<>();
        int start_row = 0;
        int start_col = 0;
        int end_row = arr.length-1;
        int end_col = arr[0].length-1;

        while (start_row <= end_row && start_col <= end_col) {
            // left to right
            for (int i = start_col; i <= end_col; i++) {
                list.add(arr[start_row][i]);
            }

            // top to bottom
            for (int j = start_row + 1; j <= end_row; j++) {
                list.add(arr[j][end_col]);
            }

            // right to left 
             if (start_row < end_row) {
                for (int k = end_col - 1; k >= start_col; k--) {
                    list.add(arr[end_row][k]);
                }
            }

            // bottom to top
            if (start_col < end_col) {
                for (int l = end_row - 1; l > start_row; l--) {
                    list.add(arr[l][start_col]);
                }
            }

            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }

        return list;

    }
}
