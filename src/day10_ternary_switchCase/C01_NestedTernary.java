package day10_ternary_switchCase;

import java.util.Scanner;

public class C01_NestedTernary {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin ve
        // sayi 10 dan kucukse rakam
        // 100 den kucukse iki basamakli sayi
        //degilse 3 basamakli veya daha buyuk bir sayi yazdirinm

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz: ");
        double sayi= scan.nextDouble();

        System.out.println((sayi<0?("Negatif sayi yazdiniz"):(sayi<10&&sayi>=0)?
                ("girilen sayi: "+sayi+" bir rakamdir"):
                (sayi<100&&sayi>=10)?("girilen sayi: "+sayi+" iki basamakli bir sayidir"):
                        (sayi>=100&&sayi<1000)?("girilen sayi: "+sayi+" uc basamakli bir sayidir"):
                                ("girilen sayi: "+sayi+" uc basamaktan daha fazla sayiya sahiptir")));
    }
}
