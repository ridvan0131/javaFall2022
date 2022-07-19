package day07_ifElse;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {
        // Kullanicidan dikdortgenin kenar uzunluklarini siteyin ve dikdortgen olup olmadigini yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kenar uzunluklarindan birisini giriniz");
        double sayi1= scan.nextDouble();
        System.out.println("Lutfen dikdortgenin kenar uzunluklarindan ikincisini giriniz");
        double sayi2= scan.nextDouble();
        if (sayi1==sayi2) {
            System.out.println("Verilen uzunluklar bir kareye aittir");
        }else {
            System.out.println("Verilen uzunluklar bir kareye ait degildir");
        }

    }


}
