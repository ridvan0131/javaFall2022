package day08_nestedIfElse;

import java.util.Scanner;

public class Odev_3 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi aliniz ve sayinin mutlak degerini yazdiriniz
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        double sayi=scan.nextDouble();

        System.out.println((sayi>=0)?"sayinin mutlak degerli ifadesi: "+sayi+" dir.":"sayinin mutlak degerli ifadesi: "+(-1*sayi)+" dir.");
    }
}
