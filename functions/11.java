


class Funct{

    public static boolean areConsecutive(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int mid = a + b + c - min - max;

        return (max - mid == 1) && (mid - min == 1);
    }

    public static void main(String[] args) {
        System.out.println(areConsecutive(1, 2, 3));  // true
        System.out.println(areConsecutive(1, 3, 2));  // true
        System.out.println(areConsecutive(1, 2, 4));  // false
    }
}

