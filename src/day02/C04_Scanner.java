package day02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen isminizi yaziniz :");
        String isim=scan.next();
        System.out.println("Lutfen soyadinizi giriniz :");
        String soyad=scan.next();
        System.out.println("Lutfen yasinizi giriniz :");
        int yas=scan.nextInt();
        System.out.println("girilen isim : "+isim+" "+soyad+ " "+"yasiniz : " +yas);

    }
}
