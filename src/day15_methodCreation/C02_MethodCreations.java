package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreations {
    public static void main(String[] args) {
        //Kullaniciya kaca sayi toplamak istedigini sorun
        //Kullanici 2,3 veya 4 degerini girerse kullanicidan bu sayilari girmesini isteyin
        // ve sayilarin toplamini yazdirin
        // Kullanici toplamak istedigi sayi adedini 4 den buyuk girerse cok sayi girdiniz ven toplayamam yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen kac sayi toplamak istediginizi belirtiniz(Maximum 4 sayi toplayabilirim.)");
        int tercih=scanner.nextInt();

        if (tercih>4){
            tercih=5;
        }

        switch (tercih){
            case 2:
                ikiSayiTopla();
                break;
            case 3:
                ucSayiTopla();
                break;
            case 4:
                dortSayiTopla();
                break;
            case 5:
                System.out.println("4 den fazla sayi toplayamam gardas, hele ne edisen...");
                break;
            default:
                System.out.println("Gecersiz bir giris yaptiniz...");
        }

    }

    public static void dortSayiTopla() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen uc sayiyi giriniz, her birisinden sonra ENTER'a basiniz...");
        double sayi1=scanner.nextDouble();
        double sayi2= scanner.nextDouble();
        double sayi3= scanner.nextDouble();
        double sayi4= scanner.nextDouble();

        System.out.println("Girdiginiz dort sayinin toplami: "+(sayi1+sayi2+sayi3+sayi4));
    }

    public static void ucSayiTopla() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen uc sayiyi giriniz, her birisinden sonra ENTER'a basiniz...");
        double sayi1=scanner.nextDouble();
        double sayi2= scanner.nextDouble();
        double sayi3= scanner.nextDouble();

        System.out.println("Girdiginiz uc sayinin toplami :"+(sayi1+sayi2+sayi3));
    }

    public static void ikiSayiTopla() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki sayiyi giriniz, her birisinden sonra ENTER'a basiniz...");
        double sayi1=scanner.nextDouble();
        double sayi2= scanner.nextDouble();

        System.out.println("Girdiginiz iki sayinin toplami: "+(sayi1+sayi2));
    }


}
