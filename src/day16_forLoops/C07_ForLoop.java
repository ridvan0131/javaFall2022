package day16_forLoops;

import java.util.Scanner;

public class C07_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan 100 den kucuk bir tamsayi isteyin
        //1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak
        //sayi 3 un kati ise sayi yerine "Java" yazdirin
        //sayi 5 in kati ise sayi yerine "Guzeldir" yazdirin
        // sayi hem 3 hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir sayi giriniz: ");
        double sayi=scanner.nextDouble();
        int num= (int) sayi;

        if (sayi<=0||sayi>100){
            System.out.println("Lutfen verilen aralikta deger giriniz(1-100 arasinda)");
        } else if (sayi!=num) {
            System.out.println("Lutfen tam sayi giriniz.");
        }else {
            for (int i = 1; i <sayi ; i++) {
                if (i%3==0&&i%5==0){
                    System.out.println(i+" Java Guzeldir ");
                }else if (i%3==0){
                    System.out.println(i+" Java ");
                }else if (i%5==0){
                    System.out.println(i+" Guzeldir ");
                }
            }
        }
    }
}
