package day05_matematikselIslemler;

import java.util.Scanner;

public class C05_Modules {
    public static void main(String[] args) {
        //Kullanicidan 6 basamakli bir sayi al ve rakamlari topla

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 6 basamakli bir sayi giriniz...");
        int sayi= scan.nextInt();
        int rakamlarToplami=0;

        int rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        System.out.println("Verdiginiz 6 basamakli sayinin rakamlar toplami= "+rakamlarToplami+" 'dir");

    }
}
