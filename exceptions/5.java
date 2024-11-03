import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}

class FileChecker {
    public static void main(String[] args) {
        try {
            checkFile("example.txt");
        } catch (IOException | EmptyFileException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void checkFile(String fileName) throws IOException, EmptyFileException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            if (reader.readLine() == null) {
                throw new EmptyFileException("The file is empty.");
            } else {
                System.out.println("The file has content.");
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
