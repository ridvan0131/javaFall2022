package day07_ifElse;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz\n Erkek icin E, Kadin icin K  giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'K') {
            if (yas >= 60) {
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsin");
            }
        } else if (cinsiyet=='E') {
            if (yas>=65){
                System.out.println("Emekli olabilirsin");
            }else {
                System.out.println("Emekli olamazsin");
            }
        } else {
            System.out.println("Lutfen gecerli bir cinsiyet giriniz");
        }
    }
}
