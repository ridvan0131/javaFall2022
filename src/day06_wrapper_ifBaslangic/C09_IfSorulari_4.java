package day06_wrapper_ifBaslangic;

import java.util.Scanner;

public class C09_IfSorulari_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dortgenin kenar uzunluklarindan birisini giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lutfen dortgenin kenar uzunluklarindan ikincisini giriniz");
        double sayi2= scan.nextDouble();

        if (sayi1==sayi2)
            System.out.println("Girilen kenar uzunluklari bir kareye aittir");
        if (sayi1!=sayi2){
            System.out.println("Girilen kenar uzunluklari bir kareye ait degildir");
        }


    }
}
