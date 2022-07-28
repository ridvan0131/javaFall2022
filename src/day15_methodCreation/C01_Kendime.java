package day15_methodCreation;

import java.util.Scanner;

public class C01_Kendime {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyadini isteyin
        // iki farkli method olusturun
        // birisi girilen kelimeleri ilk basi buyuk sonrakiler kucuk olacak sekilde birlestirin
        // ikinci method isim ve soyismin ilk harfleri buyuk sonraki harfleri *  olacak sekilde birlestirsin
        //
        // kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihini sorun,
        // programin kalan kisminda isim ve soyismin kullanicin istedigi sekilde kullanin

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen ismini giriniz: ");
        String isim=scanner.nextLine();
        System.out.print("Lutfen soyadinizi giriniz: ");
        String soyad=scanner.nextLine();

        System.out.println("Isminizin acik gozukmesini istiyorsaniz 1'e \nKapali gozukmesini istiyorsaniz 2'ye basiniz...");
        int tercih=scanner.nextInt();

        String sonHal=null;
        if (tercih==1){
            sonHal=buyukKucuk(isim,soyad);
        } else if (tercih==2) {
            sonHal=isimGizli(isim,soyad);
        }else {
            System.out.println("Tercihinizi belirli sinirlar icinde belirleyiniz...");
        }
        System.out.println(sonHal);

    }

    private static String isimGizli(String isim, String soyad) {

        String isimGizli=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String soyadGizli=soyad.toUpperCase().charAt(0)+soyad.substring(1).replaceAll("\\w","*");

        return "Isminizin ve Soyadinizin yeni hali: "+isimGizli+" "+soyadGizli;
    }

    private static String  buyukKucuk(String isim, String soyad) {

        String isimBuyuk=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        String soyadBuyuk=soyad.toUpperCase().charAt(0)+soyad.substring(1).toLowerCase();

        return "Isminizin ve Soyadinizin yeni hali: "+isimBuyuk+" "+soyadBuyuk;

    }
}
