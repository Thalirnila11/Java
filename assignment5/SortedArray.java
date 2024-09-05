package assignment5;

public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] > target) col--;
            else row++;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5}, {7, 9, 11}, {13, 15, 17}};
        int target = 9;
        System.out.println(searchMatrix(matrix, target));
    }
}
