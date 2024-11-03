


class EH11{
  public static void main(String[] args) throws ArithmeticException {
    int a = 10;
    int b = 0;
    if (b == 0) {
      throw new ArithmeticException("Cannot divide by zero!");
    } else {
      System.out.println("Result: " + (a / b));
    }
  }
}
