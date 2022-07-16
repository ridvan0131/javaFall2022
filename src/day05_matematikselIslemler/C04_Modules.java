package day05_matematikselIslemler;

import java.util.Scanner;

public class C04_Modules {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi al ve rakamlarini topla

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
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

        System.out.println("Verdiginiz 4 basamakli sayinin rakamlar toplami= "+rakamlarToplami+" 'dir");

    }
}
