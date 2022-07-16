package day03_Scanner;

import java.util.Scanner;

public class Odev_5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz: ");
        String soyad=scan.nextLine();

        System.out.println( "Isminiz : "+ isim+"\n"+
                            "Soyadiniz : "+soyad+"\n"+
                            "Kursumuza katiliminiz alinmistir, tesekkur ederim...");

    }
}
