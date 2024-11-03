import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileReaderExample {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
