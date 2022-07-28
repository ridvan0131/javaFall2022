package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreations {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin, bu sayin tek mi cift mi oldugunu,
        // sifirdan buyuk mu kucuk mu oldugunu ayrica
        // 100 den buyukse birler, onlar ve yuzler basamaginda ki rakamlarin toplamini
        // 100 den kucukse sadece birler basamagini yazdiran 3 method yazin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi=scanner.nextInt();

        sifirdanBuyuk(sayi);


    }

    private static int sifirdanBuyuk(int sayi) {

        return sayi;

    }

    private static int tekCift(int sayi) {

        int Cift=sayi%2;
        return sayi;

    }
}
