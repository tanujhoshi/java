
class EH2 {
    public static void checkIfOdd(int number) throws IllegalArgumentException {
        if (number % 2 != 0) {
            throw new IllegalArgumentException("The number " + number + " is odd, but it should be even.");
        }
        System.out.println("The number " + number + " is even.");
    }

    public static void main(String[] args) {
        try {
            checkIfOdd(7);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }
}
