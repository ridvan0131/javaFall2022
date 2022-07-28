package day16_forLoops;

import java.util.Scanner;

public class C06_ForLoops {
    public static void main(String[] args) {
        //Kullanicidan 100'den kucuk bir tamsayi isteyin,
        // 1 den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        double sayi=scanner.nextDouble();
        int num= (int) sayi;

        if (sayi<0||sayi>100){
            System.out.println("Lutfen belirlenen araliklarda (1'den buyuk 100'den kucuk)bir sayi giriniz.");
        }else if (sayi!=num){
            System.out.println("Lutfen ondalikli bir sayi girmeyiniz, tam sayi giriniz.");
        }else {
            for (int i = 1; i <sayi; i++) {
                if (i%3==0||i%5==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
