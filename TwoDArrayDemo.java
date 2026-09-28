public class TwoDArrayDemo {

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3},
            { 4,  5,  6},
            { 7,  8,  9}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("=== 1. Original 2D Array ===");
        printMatrix(matrix);

        System.out.println("\n=== 2. Row and Column Sums ===");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Sum of Row " + i + ": " + rowSum);
        }

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Sum of Column " + j + ": " + colSum);
        }

        System.out.println("\n=== 3. Diagonals ===");
        System.out.print("Primary Diagonal: ");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < rows; i++) {
            System.out.print(matrix[i][cols - 1 - i] + " ");
        }
        System.out.println();

        System.out.println("\n=== 4. Transposed Matrix ===");
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);

        System.out.println("\n=== 5. Jagged Array Traversal ===");
        int[][] jagged = {
            {10, 20},
            {30, 40, 50, 60},
            {70}
        };
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + " (length " + jagged[i].length + "): ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.printf("%4d", val);
            }
            System.out.println();
        }
    }
}