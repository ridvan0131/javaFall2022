package day02;

import java.util.Locale;
import java.util.Scanner;

public class Odev_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");
        String isim=scan.nextLine();
        char ilkKarekter=isim.toLowerCase(Locale.ROOT).charAt(0);

        System.out.println("isminizin ilk karakteri: "+ilkKarekter);

    }
}
