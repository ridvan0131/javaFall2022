package day16_forLoops;

import java.util.Scanner;

public class C11_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan iki sayi isteyin,
        // Girilen sayilar ve aralarinda ki tum tamsailari toplayip
        // sonucu yazdiran bir program yaziniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz.");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        int toplam=0;

        if (sayi1>sayi2){
            for (int i = sayi1; i >=sayi2; i--) {
                toplam+=i;
            }
        }else if (sayi2>sayi1){
            for (int i = sayi2; i >=sayi1; i--) {
                toplam+=i;
            }
        }
        System.out.println("Girilen iki sayinin toplami= "+toplam);
    }
}
