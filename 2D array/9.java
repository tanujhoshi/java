
class ary2 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[] rowSums = new int[rows];
        int[] columnSums = new int[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                rowSums[i] += matrix[i][j];
            }
        }

        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                columnSums[j] += matrix[i][j];
            }
        }

        System.out.println("Sum of each row:");
        for (int i = 0; i < rows; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }

        System.out.println("\nSum of each column:");
        for (int j = 0; j < columns; j++) {
            System.out.println("Column " + (j + 1) + ": " + columnSums[j]);
        }
    }
}
