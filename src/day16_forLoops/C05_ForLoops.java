package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoops {
    public static void main(String[] args) {
        //Kullanicidan 100 den kucuk bir tamsayi degeri isteyin, 1 den baslayarak 3'un katlari olan sayilari yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen 100 den kucuk bir tamsayi degeri giriniz: ");
        double sayi=scanner.nextDouble();
        int num= (int) sayi;

            if (sayi<=0||sayi>100){
                System.out.print("Lutfen negatif bir sayi yada 100 den buyuk bir sayi girmeyiniz.");
            } else if (num!=sayi) {
                System.out.print("Lutfen ondalikli bir sayi girmeyiniz, tam sayi giriniz");
            }else  {
                for (int i = 1; i <= sayi; i++) {
                    if (i%3==0){
                        System.out.print(i+" ");
                    }
                }
        }



    }
}
