package day06_wrapper;

import java.util.Scanner;

public class C10_IfSorulari_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun=scan.next().toLowerCase();

        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun.equals("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun.equals("pazar")){
            System.out.println("Hristiyanlar icin kutsal gun");
        }
        if (!gun.equals("cuma")&&!gun.equals("pazar")&&!gun.equals("cumartesi")){
            System.out.println("Kafana gore takil");
        }
    }
}
