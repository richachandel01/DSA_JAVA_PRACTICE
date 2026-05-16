// Problem: Set Matrix Zeroes

// Time Complexity: O(m*n)
// Space Complexity: O(m+n)

import java.util.Arrays;

public class Day03_SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] row = new boolean[rows];
        boolean[] col = new boolean[cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        setZeroes(matrix);

        for(int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}