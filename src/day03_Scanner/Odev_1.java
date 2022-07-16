package day03_Scanner;

import java.util.Scanner;

public class Odev_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz= ");
        int sayi1=scan.nextInt();
        System.out.println("ikinci tamsayiyi giriniz= ");
        int sayi2=scan.nextInt();
        int sayilarinCarpimi=sayi2*sayi1;
        int sayilarinToplami=sayi2+sayi1;
        int sayilarinFarki=(sayi1-sayi2);


        System.out.println("Sayilarin Carpimi= "+sayilarinCarpimi+"\n"+
                "Sayilarin Toplami= "+sayilarinToplami+"\n"+
                "Sayilarin Farki= "+sayilarinFarki);
    }
}
