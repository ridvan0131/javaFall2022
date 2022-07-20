package day08_nestedIfElse;

import java.util.Scanner;

public class C02_NestedIf {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi girmesini isteyin.
        //Girdigi sayi 5'e bolunuyorsa son rakamini kontraol edin,
        //Son rakam 0 ise 5 e bolunen cift sayi yazdirin
        // son rakami 0 degil ise 5'e bolunen tek sayi yazdirin,
        //Girdigi sayi 5'e bolunmuyorsa ekrana tekrar deneyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz: ");
        int sayi=scan.nextInt();
        if ((sayi<10000&&sayi>=1000)||(sayi<-1000&&sayi>=-10000)){
            if (sayi%5==0){
                if (sayi%2==0){
                    System.out.println("Girmis oldugunuz sayi 5'e bolunen cift sayidir");
                }else {
                    System.out.println("Girmis oldugunuz sayi 5'e bolunen tek sayidir");
                }
            } else {
                System.out.println("Tekrar deneyin");
            }
        }else {
            System.out.println("Lutfen 4 basamakli bir sayi giriniz...");
        }

    }
}
