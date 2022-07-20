package day08_nestedIfElse;

import java.util.Scanner;

public class Odev_4 {
    public static void main(String[] args) {
        //Kullanicidan bir syi alin, sayi pozitifse  sayi pozitifdir, negatifse sayinin karesini yazdir
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        System.out.println((sayi>=0)?sayi+" sayisi pozitif bir sayidir": "verilen sayi negatif oldugu icin sonuc: "+sayi*sayi);
    }
}
