package day07_ifElse;

import java.util.Scanner;

public class KendimeOrnekler_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir TAMsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi==0){
            System.out.println("Sayimiz sifir");
        } else if (sayi>0) {
            System.out.println("Sayimiz pozitif bir sayi");
        }else {
            System.out.println("Sayimiz negatif bir sayidir");
        }
    }
}
