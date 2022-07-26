package day13_stringManipulation;

import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim=scanner.nextLine();
        System.out.print("Lutfen soyadinizi giriniz: ");
        String soyad=scanner.nextLine();

        if (isim.length()==soyad.length()){
            System.out.println("isim ve soyad karakterleri esit");
        }else if (isim.length()>soyad.length()){
            System.out.println("isim karakteri soyad karakterlerinden fazla");
        }else {
            System.out.println("soyad karakterleri isim karakterlerinden fazla");
        }
    }
}
