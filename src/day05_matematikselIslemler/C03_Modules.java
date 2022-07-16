package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Modules {
    public static void main(String[] args) {
       //Kullanicidan 3 basamakli bir sayi al, rakamlari toplamini yazdir
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz...");
        int sayi= scan.nextInt();
        int rakamlarToplami=0;

        int rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        rakamlarToplami+=sayi;


        System.out.println("Verdiginiz 3 basamakli sayinin rakamlar toplami= "+rakamlarToplami+" 'dir");





        rakamlarToplami+=rakam;


    }
}
