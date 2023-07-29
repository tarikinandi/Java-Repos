import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        int total = 0;


        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\muhta\\OneDrive\\Documents\\GitHub\\Java-Repos\\Java Project\\readingFileDemo\\src\\sayilar.txt"));
            String line = null;
            while ((line = reader.readLine()) != null){
                total += Integer.valueOf(line);
            }
            System.out.println("Total = " + total);
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        }finally {
            reader.close();
        }
    }
}