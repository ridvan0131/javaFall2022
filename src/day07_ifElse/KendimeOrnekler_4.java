package day07_ifElse;

import java.util.Scanner;

public class KendimeOrnekler_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1-7 arasinda bir sayi giriniz, size hangi gun oldugunu soyleyeyim :)) ");
        int sayi=scan.nextInt();
        if (sayi<=0||sayi>7){
            System.out.println("Lutfen verilen aralikta bir deger giriniz.");
        } else if (sayi==1) {
            System.out.println("Girilan gun Pazartesi'dir");
        }else if (sayi==2) {
            System.out.println("Girilan gun Sali'dir");
        }else if (sayi==3) {
            System.out.println("Girilan gun Carsamba'dir");
        }else if (sayi==4) {
            System.out.println("Girilan gun Persembe'dir");
        }else if (sayi==5) {
            System.out.println("Girilan gun Cuma'dir");
        }else if (sayi==6) {
            System.out.println("Girilan gun Cumartesi'dir");
        }else {
            System.out.println("Girilan gun Pazar'dir");
        }

    }
}
