
class EH13 {
    public static void main(String[] args) {
        try {
            try {
                int num = 10 / 0;
                System.out.println("Inner try block: " + num);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch block: " + e.getMessage());
            }
            String str = null;
            System.out.println("Outer try block: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Outer catch block: " + e.getMessage());
        }
    }
}
