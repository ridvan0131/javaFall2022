package day10_ternary_switchCase;

import java.util.Scanner;

public class C02_NestedTernary {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // kucuk harf ise consola kucuk harf
        // buyuk harf ise buyuk harf yazidirn
        // bunlarin ikisi de degilse karakter harf degildir yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf harf giriniz: ");
        char karakter=scan.next().charAt(0);

        System.out.println((karakter<'A'||karakter>'Z')&&(karakter<'a'||karakter>'z')?"Karakter harf degildir!!!":
                (karakter>='A'&&karakter<='Z')?"Buyuk Harf":"Kucuk Harf");
    }
}
