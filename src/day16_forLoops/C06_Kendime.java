package day16_forLoops;

import java.util.Scanner;

public class C06_Kendime {
    public static void main(String[] args) {
        //Kullanicidan 100'den kucuk bir tamsayi isteyin,
        // 1 den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tamsayi degeri giriniz. ");
        double sayi=scanner.nextDouble();

        if (sayi>100||sayi<=0) {
            System.out.println("Lutfen 100'den kucuk ve 0'dan buyuk sayi giriniz");
        }else {
            for (int i = 1; i <=sayi ; i++) {
                if (i%5==0&&i%3==0){
                    System.out.print(i+" ");
                }else if (i%3==0){
                    System.out.print(i+" ");
                }else if (i%5==0){
                    System.out.print(i+" ");
                }
            }
        }
    }
}
