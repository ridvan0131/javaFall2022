package day16_forLoops;

import java.util.Scanner;

public class C12_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryel'ini bulun
        //Faktoryel=5!=5*4*3*2*1

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 10'dan kucuk bir tamsayi giriniz: ");
        int sayi=scanner.nextInt();

        System.out.print(sayi+"!=");
        int faktoryel=1;
        if (sayi<=0){
            System.out.print("Istenen sayinin faktoryel degeri 0(sifir) dir");
        }else if (sayi>10){
            System.out.print("Lutfen 10'dan buyuk bir sayi girmeyiniz...");
        }else {
            for (int i = sayi; i > 1; i--) {
                faktoryel *= i;
                System.out.print(i+"*");
            }
            System.out.print("1="+ faktoryel);
        }

    }
}
