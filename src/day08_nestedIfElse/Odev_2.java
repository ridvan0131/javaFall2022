package day08_nestedIfElse;

import java.util.Scanner;

public class Odev_2 {
    public static void main(String[] args) {
        // Kullanicidan bir tamsayi aliniz sayinin tek yada cift oldugunu yazdiriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz: ");
        int sayi=scan.nextInt();

        System.out.println((sayi%2==0)?sayi+ " cift sayidir":sayi+" tek sayidir");
    }
}
