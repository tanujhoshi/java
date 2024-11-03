
class Array {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 0, 0, 0 }, { 0, 0, 3, 6 }, { 4, 0, 0, 9 } };
        int zeroCount = 0;
        System.out.println("Length of row : " + matrix.length);
        System.out.println("Length of column[0] : " + matrix[0].length);
        int totalElements = matrix.length * matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }
        if (zeroCount > (totalElements / 2)) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");

        }
    }
}


