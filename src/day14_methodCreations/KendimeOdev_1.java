package day14_methodCreations;

import java.util.Scanner;

public class KendimeOdev_1 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin,
        // Bu sayinin tek mi cift mi oldugunu sifirdan buyuk mu kucuk mu oldugunu ayrica
        // 100 den buyukse birler onlar yuzler basamagindaki rakamlarin toplamini ,
        // 100 den kucukse sadece 1 ler basamagini yazdiran 3 method yaziniz

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi=scanner.nextInt();

        tekMiCiftMi(sayi);
        sifirdanBuyukMu(sayi);
        yuzdenBuyukMu(sayi);
        yuzdenKucukMu(sayi);

    }

    private static void yuzdenKucukMu(int sayi) {
    }

    private static void yuzdenBuyukMu(int sayi) {
    }

    private static void sifirdanBuyukMu(int sayi) {
    }

    private static void tekMiCiftMi(int sayi) {
    }
}
