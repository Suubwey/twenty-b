package MatrixMultiplication;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        MatrixMult multiplier = new MatrixMult();
        
        int[][] resultingMatrix = multiplier.multiply(matrix1, matrix2);
        
        System.out.println(Arrays.deepToString(resultingMatrix));
    }
}
