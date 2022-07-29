package day16_forLoops;

import java.util.Scanner;

public class C05_Kendime {
    public static void main(String[] args) {
        //Kullanicidan 100 den kucuk bir tamsayi degeri isteyin, 1 den baslayarak 3'un katlari olan sayilari yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir sayi giriniz.");
        double sayi=scanner.nextDouble();
        int num= (int) sayi;
        if (sayi>100){
            System.out.println("Yuzden buyuk bir sayi girmeyiniz. ");
        }else if (sayi<0){
            System.out.println("Lutfen negatif bir deger girmeyiniz. ");
        }else if (num!=sayi){
            System.out.println("Lutfen tamsayi degeri giriniz. ");
        }else {
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0){
                    System.out.print(i+" ");
                }
                }
            }
        }
    }
