

class Funct{

    public static boolean isMiddlePoint(int a, int b, int c) {
        if (a <= b && b <= c) {
            return (b == (a + c) / 2);
        } else if (a <= c && c <= b) {
            return (c == (a + b) / 2);
        } else if (b <= a && a <= c) {
            return (a == (b + c) / 2);
        } else if (b <= c && c <= a) {
            return (c == (b + a) / 2);
        } else if (c <= a && a <= b) {
            return (a == (c + b) / 2);
        } else {
            return (b == (c + a) / 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(isMiddlePoint(1, 2, 3));  // true
        System.out.println(isMiddlePoint(1, 3, 2));  // true
        System.out.println(isMiddlePoint(2, 1, 3));  // true
        System.out.println(isMiddlePoint(1, 2, 4));  // false
    }
}

