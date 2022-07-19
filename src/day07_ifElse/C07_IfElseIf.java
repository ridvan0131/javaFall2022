package day07_ifElse;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {
        //Kullanicidan 100 uzerinden bir not isteyin,
        // 50'den kucukse D
        // 50-60 arasinda ise C
        // 60-80 arasinda ise B
        // 80-100 arasinda ise A

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen aldiginiz notu giriniz: ");
        double not=scan.nextDouble();

        if (not>=80){
            System.out.println("Tebrikler aldiginiz not A...");
        } else if (not>=60) {
            System.out.println("Guzel bir not aldiniz, B...");
        } else if (not>=50) System.out.println("Daha da calisabilirsin ama gectin, C");

        else{
            System.out.println("Fena degil gectin ama, buna da sukur D...");
        }
    }
}

