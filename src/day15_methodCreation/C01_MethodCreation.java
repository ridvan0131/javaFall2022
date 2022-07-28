package day15_methodCreation;

import java.util.Scanner;

public class C01_MethodCreation {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyadini isteyin
        // iki farkli method olusturun
        // birisi girilen kelimeleri ilk basi buyuk sonrakiler kucuk olacak sekilde birlestirin
        // ikinci method isim ve soyismin ilk harfleri buyuk sonraki harfleri *  olacak sekilde birlestirsin
        //
        // kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihini sorun,
        // programin kalan kisminda isim ve soyismin kullanicin istedigi sekilde kullanin

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");
        String isim=scanner.next();

        System.out.println("Lutfen soyadinizi giriniz: ");
        String soyisim=scanner.next();

//        ilkBuyukSonrakilerKucuk(isim,soyisim);
//        ilkBuyukSonrakilerYildiz(isim,soyisim);

        System.out.print("Lutfen isminizin acik yazilmasini istiyorsaniz 1'e\nAcik yazilmasini istemiyorsaniz 2'ye basiniz:");
        int acikKapali=scanner.nextInt();

        String birlesmisIsim=null;

        if (acikKapali!=1&&acikKapali!=2){
            System.out.println("Lutfen belirlenen rakamlardan birisini giriniz");
        } else if (acikKapali==1) {
            birlesmisIsim=ilkBuyukSonrakilerKucuk(isim,soyisim);
        }else {
            birlesmisIsim=ilkBuyukSonrakilerYildiz(isim,soyisim);
        }

        System.out.println("Tercihiniz: "+birlesmisIsim);
    }

    public static String  ilkBuyukSonrakilerYildiz(String isim, String soyisim) {

        String yeniIsim=isim.toUpperCase().charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yeniSoyad=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).replaceAll("\\w","*");

        return "Isim: "+yeniIsim+"\n"+"Soyisim: "+yeniSoyad;
    }

    public static String ilkBuyukSonrakilerKucuk(String isim, String soyisim) {

        String yeniIsim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        String yeniSoyad=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase();

        return "Isim: "+yeniIsim+"\n"+"Soyisim: "+yeniSoyad;

    }
}
