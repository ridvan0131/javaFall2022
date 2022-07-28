package day15_methodCreation;

import java.util.Scanner;

public class C02_Kendime {
    public static void main(String[] args) {
        //Kullaniciya kac sayi toplamak istedigini sorun
        //Kullanici 2,3 veya 4 degerini girerse kullanicidan bu sayilari girmesini isteyin
        // ve sayilarin toplamini yazdirin
        // Kullanici toplamak istedigi sayi adedini 4 den buyuk girerse cok sayi girdiniz ven toplayamam yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac sayi toplamak istiyorsunuz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println("Ule bu kadar sayi toplanir mu? Ne edisen.... ");
        } else if (sayi == 2) {
            ikiSayi();
        } else if (sayi == 3) {
            ucSayi();
        } else if (sayi == 4) {
            dortSayi();
        } else {
            System.out.println("Bundan fazlasi beni asar, ben toplayamam bu kadar sayiyi...");
        }


    }

    private static void dortSayi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen toplamak istediginiz dort sayiyi giriniz, her birisinden sonra ENTER'a basiniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sayi3 = scanner.nextDouble();
        double sayi4 = scanner.nextDouble();

        System.out.println("Girmis oldugunuz dort sayinin toplami= " + (sayi1 + sayi2 + sayi3 + sayi4));

    }

    private static void ucSayi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen toplamak istediginiz uc sayiyi giriniz, her birisinden sonra ENTER'a basiniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sayi3 = scanner.nextDouble();

        System.out.println("Girmis oldugunuz uc sayinin toplami= " + (sayi1 + sayi2 + sayi3));
    }

    private static void ikiSayi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen toplamak istediginiz iki sayiyi giriniz, her birisinden sonra ENTER'a basiniz: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println("Girmis oldugunuz iki sayinin toplami= " + (sayi1 + sayi2));
    }
}


