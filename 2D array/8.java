
class Array {
    public static void main(String[] args) {
        int arr[][] = { { 1, 3, 2 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int EvenC = 0, OddC = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] % 2 == 0)
                    EvenC++;
                else
                    OddC++;
            }
        }
        System.out.println("Even Elements present in array : " + EvenC);
        System.out.println("Odd Elements present in array : " + OddC);
    }
}
