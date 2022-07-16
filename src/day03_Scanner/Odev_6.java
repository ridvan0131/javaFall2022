package day03_Scanner;

import java.util.Scanner;

public class Odev_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz: ");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyadinizi yaziniz: ");
        String soyad=scan.nextLine();

        System.out.println("Isim - soyisim : "+isim+" "+soyad);

    }
}
