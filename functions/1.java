class SmallestNumber {

  static  int Smallest(int num1, int num2, int num3) {
        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        return smallest;
    }

    public static void main(String[] st) {
        int num1 = 10, num2 = 5, num3 = 7;
        System.out.println("The smallest number is: " + Smallest(num1, num2, num3));
    }
}
