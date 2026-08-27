class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int m = 0;
        int n = mat.length;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i];

            sum = sum + mat[i][mat.length - 1 - i];

        }
        if (n % 2 != 0) {
            m = mat[n / 2][n / 2];
        }
        return sum - m;
    }
}