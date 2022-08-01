package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C02_NestedForLoop_OgrenmekIcinGuzel {
    public static void main(String[] args) {
        //Kullanicidan 10 dun kucuk pozitif bir tamsayi girmesini isteyin
        // giridigj sayiya gore asagidai sekli yazdirin
        // ornegin 3 girilirse
        //1
        //1 2
        //1 2 3

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi=scanner.nextInt();

        if (sayi>10){
            System.out.println("Girdiginiz sayi 10'dan kucuk olmali");
        } else if (sayi<=0) {
            System.out.println("Girdiginiz sayi 0'dan buyuk olmali");
        }else {
            for (int satir = 1; satir <= sayi; satir++) {
                for (int i = 1; i <= satir; i++) {
                    System.out.print( i + " ");
                }
                System.out.println("");
            }
        }
    }
}
