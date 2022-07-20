package day08_nestedIfElse;

import java.util.Scanner;

public class Odev_1 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin ve buyuk olani yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz,Birinci sayidan sonra ENTER'e basiniz: ");
        int s1= scan.nextInt();
        int s2=scan.nextInt();

        System.out.println((s1>s2)?"Buyuk sayi: "+s1: "Buyuk sayi: "+s2);


    }
}
