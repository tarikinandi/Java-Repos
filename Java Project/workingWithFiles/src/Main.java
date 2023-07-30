import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createFile();
        System.out.println();
        System.out.println("Dosya bilgisi : ");
        getFileInfo();
        System.out.println();
        System.out.println("Dosya içeriği : ");
        readFile();
        System.out.println();
        System.out.println("Dosyaya yazdırıyoruz : ");
        writeFile();
        System.out.println();
        System.out.println("Son hali : ");
        readFile();
    }

    public static void createFile(){
        File file = new File("C:\\Users\\muhta\\OneDrive\\Documents\\GitHub\\Java-Repos\\Java Project\\workingWithFiles\\Files\\students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya oluşturuldu.");
            }
            else {
                System.out.println("Dosya zaten oluşturulmuş.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\Users\\muhta\\OneDrive\\Documents\\GitHub\\Java-Repos\\Java Project\\workingWithFiles\\Files\\students.txt");
        if (file.exists()){
            System.out.println("Dosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi : " + file.canWrite());
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya boyutu : " + file.length());
        }
    }

    public static void readFile(){
        File file = new File("C:\\Users\\muhta\\OneDrive\\Documents\\GitHub\\Java-Repos\\Java Project\\workingWithFiles\\Files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\muhta\\OneDrive\\Documents\\GitHub\\Java-Repos\\Java Project\\workingWithFiles\\Files\\students.txt",true));
            writer.newLine();
            writer.write("Selim");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}