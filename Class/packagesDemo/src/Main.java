import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sayı giriniz : ");
        int numb = scanner.nextInt();

        System.out.println("Seçilen sayı : " + numb);

        DortIslem dortIslem = new DortIslem();
        dortIslem.sum(14 , 16);

        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}