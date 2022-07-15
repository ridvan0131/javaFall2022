package day02;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz :");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz :");
        String soyad=scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz :");
        int yas=scan.nextInt();
        System.out.println("girilen isim : "+isim+" "+soyad+ " "+"yasiniz : " +yas);

    }
}
