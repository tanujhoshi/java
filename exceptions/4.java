import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}

class NumberChecker {
    public static void main(String[] args) {
        try {
            checkNumbers("numbers.txt");
        } catch (IOException | PositiveNumberException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void checkNumbers(String fileName) throws IOException, PositiveNumberException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                if (number > 0) {
                    throw new PositiveNumberException("Positive number found: " + number);
                }
                System.out.println("Read number: " + number);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
