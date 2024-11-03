


import java.util.Scanner;

class EH6{
  public static void checkDuplicates() throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a list of integers (separated by spaces):");
    String input = scanner.nextLine();
    String[] numbers = input.split(" ");

    for (int i = 0; i < numbers.length; i++) {
      int num = Integer.parseInt(numbers[i]);
      for (int j = i + 1; j < numbers.length; j++) {
        if (num == Integer.parseInt(numbers[j])) {
          throw new Exception("Duplicate number found: " + num);
        }
      }
    }
    System.out.println("No duplicates found in the list.");
  }

  public static void main(String[] args) {
    try {
      checkDuplicates();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
