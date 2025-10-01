//public class setZeroes {
    import java.util.*;

    class Solution1 {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length, n = matrix[0].length;
            boolean firstRow = false, firstCol = false;

            //step 1: check first row
            for (int j = 0; j < n; j++) {
                if (matrix[0][j] == 0) {
                    firstRow = true;
                    break;
                }
            }

            //step 1: check first col
            for (int i = 0; i < m; i++) {
                if (matrix[i][0] == 0) {
                    firstCol = true;
                    break;
                }
            }

            //step 2: mark zeros
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }

            //step 3: update using markers
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }

            //step 4: handle first row
            if (firstRow) {
                for (int j = 0; j < n; j++) {
                    matrix[0][j] = 0;
                }
            }

            //handle first col
            if (firstCol) {
                for (int i = 0; i < m; i++) {
                    matrix[i][0] = 0;
                }
            }
        }

        // ✅ Main method for testing
        public static void main(String[] args) {
            Solution1 sol = new Solution1();

            int[][] matrix = {
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1}
            };

            System.out.println("Original Matrix:");
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }

            sol.setZeroes(matrix);

            System.out.println("\nMatrix after setZeroes:");
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
        }
    }

//}
