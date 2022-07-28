package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodOverloading {
    public static void main(String[] args) {
        /*
		 Soru 1 ) Kullanicidan bir sayi alin.
		 Bu sayinin tek mi cift mi oldugunu,
		 sifirdan buyuk mu kucuk mu oldugunu,
		 ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 	100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi=scanner.nextInt();

       tekMiCiftMi(sayi);
    }

    private static void yuzdenBuyukMuKucukMu(int sayi) {
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        int rakamlarToplami=birler+onlar+yuzler;

        if (sayi>100){
            System.out.println("Girilen sayinin birler onlar yuzler basamagindaki rakamlar toplami= "+rakamlarToplami);
        }else {
            System.out.println("Birler basamaginda ki rakam= "+birler);
        }
    }

    private static void sifirdanBuyukMu(int sayi) {
        if (sayi>0){
            System.out.println("Verilen sayi sifirdan BUYUKTUR...");
        }else{
            System.out.println("Verilen sayi sifirdan kucuktur.");
        }
    }

    private static void tekMiCiftMi(int sayi) {
        if (sayi%2==0){
            System.out.println("Girilen sayi cifttir.");
        }else if (sayi%2==1||sayi%2==(-1)){
            System.out.println("Girilen sayi tektir.");
        }else {
            System.out.println("Girilen sayi tam sayi degildir...");
        }

    }


}
