package day07_ifElse;

import java.util.Scanner;

public class KendimeOrnekler_5 {
    public static void main(String[] args) {
        //verilen sayinin kayip yil olup olmadigini bulalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir yil giriniz, size artik olup olmadigini soyleyeyim");
        int yil=scan.nextInt();

        boolean x=yil%4==0;
        boolean y=yil%100!=0;
        boolean z=yil%100==0 && yil%400==0;

        if (x && (y || z)){
            System.out.println(yil+" ARTIK yildir");
        }else {
            System.out.println(yil+ " Artik bir yil DEGILDIR ");
        }
    }
}
