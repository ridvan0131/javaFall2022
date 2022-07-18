package day06_wrapper;

import java.util.Scanner;

public class C06_IfSorulari_1 {
    public static void main(String[] args) {
        //Kullanicidan bir tamsayi isteyin ve sayinin cift yada tek oldugunu yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("Girilen sayi cifttir");
        }

        if (sayi%2!=0){
            System.out.println("Girilen sayi tektir");
        }
    }
}
