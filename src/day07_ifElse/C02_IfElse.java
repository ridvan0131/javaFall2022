package day07_ifElse;

import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {

        // bir karakter giriniz harf olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);

        if (('A'<=karakter&&karakter<='Z') ||('a'<=karakter&&karakter<='z')){
            System.out.println("Girilen karakter harftir...");
        }else{
            System.out.println("Girilen karakter harf DEGILDIR...");
        }



    }
}
