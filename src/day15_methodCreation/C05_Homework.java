package day15_methodCreation;

import java.util.Scanner;

public class C05_Homework {
    public static void main(String[] args) {
        	/*
		 Soru 4) Kullanicidan ismini, soyismini
		 ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin.
		 Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
		 KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin,
		 ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.

		 */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim=scanner.nextLine();
        System.out.print("Lutfen soyadinizi giriniz: ");
        String soyad=scanner.nextLine();
        System.out.print("Lutfen kredi kart numaranizi 16 hane seklinde aralarinda bosluk olmadan giriniz: ");
        String kkNo=scanner.nextLine();


        System.out.println(isimSoyadBuyuk(isim,soyad)+"\n"+kkNoTeyit(kkNo));

    }

    private static String kkNoTeyit(String kkNo) {

        String kkSonHal;

        if(kkNo.length()!=16){
          kkSonHal=  "Kredi karti numaranizi eksik yada fazla girdiniz, 16 hane olarak aralarinda bosluk olmadan giriniz";
        } else if (kkNo.contains(" ")) {
            kkSonHal="Bosluk olmadan girmelisiniz";
        }else {
            kkSonHal=kkNo.substring(0,4)+" "+kkNo.substring(4,8)+" "+kkNo.substring(8,12)+" "+kkNo.substring(12);
        }
        return kkSonHal;
    }

    private static String isimSoyadBuyuk(String isim,String soyad) {
        String isimBuyuk=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyadBuyuk=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();

        return isimBuyuk+" "+soyadBuyuk;
    }
}
