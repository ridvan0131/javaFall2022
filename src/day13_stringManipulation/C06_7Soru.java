package day13_stringManipulation;

import java.util.Scanner;

public class C06_7Soru {
    public static void main(String[] args) {
        //Kullanicidan ismini, soyadini ve kredi karti bilgilerini isteyin ve
        // asagidaki gibi yazdirin
        //isim-soyad:M***** B********
        //kart no: **** **** **** 1234

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim=scanner.nextLine();
        System.out.print("Lutfen soyadinizi giriniz: ");
        String soyad=scanner.nextLine();
        System.out.print("Lutfen kredi kart numaranizi 16 haneli ve 4'er karakter olacak sekilde giriniz: ");
        String kredi=scanner.next();


        String isimFormatli=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        String soyisimFormatli=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\w","*");
        String krediKartiFormatli="**** **** **** "+kredi.substring(12);

        System.out.println("isim-soyisim: "+isimFormatli+" "+soyisimFormatli);
        System.out.println("Kart No: "+krediKartiFormatli);
    }
}
