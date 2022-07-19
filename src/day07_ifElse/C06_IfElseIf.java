package day07_ifElse;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("iki sayi giriniz, ilk sayidan sonra ENTER'a basiniz...");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>0&&sayi2>0){
            System.out.println(sayi1+sayi2);
        }else if (sayi1<0&&sayi2<0){
            System.out.println(sayi1*sayi2);
        } else if ((sayi1<0&&sayi2>0)||(sayi1>0&&sayi2<0)){
            System.out.println("farkli isaretli sayilarla islem yapamazsiniz...");
        } else
            System.out.println("sifir carpmaya gore yutan elemandir...");


    }
}
