
class EH1 {
    public static void main(String[] args) {
        try {
            System.out.println("Entering the try block.");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
