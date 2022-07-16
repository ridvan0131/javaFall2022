package day03_Scanner;

import java.util.Scanner;

public class Odev_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz= ");
        double kenar=scan.nextDouble();

        double alan=kenar*kenar;
        double cevre=kenar*4;

        System.out.println("Karenin alani= "+ alan+ "\n"+"Karenin cevresi= "+cevre);

    }
}
