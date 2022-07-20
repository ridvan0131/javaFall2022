package day08_nestedIfElse;

import java.util.Scanner;

public class C01_NestedIf {
    public static void main(String[] args) {
        // Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin,
        // Ilk harf A ise Gecerli Sifre degilse GEcersiz sifre yazdirin
        //eger ilk harf kucuk harf ise z olup olmadigini kontrol edin
        //ilk harf z ise gecerli sifre degilse gecersiz sifre deyin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz: ");
        char sifre=scan.next().charAt(0);

        if (sifre>='A'&&sifre<='Z'){
            if (sifre=='A'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }
        } else if (sifre>='a'&&sifre<='z') {
            if (sifre=='z'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }
        }else {
            System.out.println("Lutfen ilk karakteri harf olan bir sifre giriniz");
        }
    }
}
