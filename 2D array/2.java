class Array {
    public static void main(String[] args) {
         int[][] matrixA = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
         int[][] matrixB = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };
        int[][] matrixSum = new int[3][3];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[0].length; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];

            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < matrixSum.length; i++) {
            for (int j = 0; j < matrixSum[0].length; j++) {
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}