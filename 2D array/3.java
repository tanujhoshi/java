class Array {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        int[][] matrixProduct = new int[3][3];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    matrixProduct[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Product of the matrices:");
        for (int i = 0; i < matrixProduct.length; i++) {
            for (int j = 0; j < matrixProduct[0].length; j++) {
                System.out.print(matrixProduct[i][j] + " ");
            }
            System.out.println();
        }}}
    
