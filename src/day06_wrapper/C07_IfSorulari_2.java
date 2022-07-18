package day06_wrapper;

import java.util.Locale;
import java.util.Scanner;

public class C07_IfSorulari_2 {
    public static void main(String[] args) {
        //Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birisini giriniz: ");
        char gun=scan.next().toUpperCase().charAt(0);

        if (gun=='P'){
            System.out.println("Girilen gun Pazar,Pazartesi,Persembe olabilir");
        }
        if (gun=='S'){
            System.out.println("Girilen gun Sali olabilir");
        }
        if (gun=='C'){
            System.out.println("Girilen gun Carsamba,Cuma,Cumartesi olabilir");
        }
        if (gun != 'C' && gun !='P' && gun != 'S'){
            System.out.println("Lutfen mantikli birsey giriniz");
        }

    }
}
