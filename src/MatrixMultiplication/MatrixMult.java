package MatrixMultiplication;

public class MatrixMult {
    public int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length, n = matrix1[0].length, p = matrix2[0].length;
        int[][] product = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int j2 = 0; j2 < n; j2++) {
                    product[i][j] += matrix1[i][j2] * matrix2[j2][j];
                }
            }
        }
        return product;
    }
}
