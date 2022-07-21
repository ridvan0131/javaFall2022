package day10_ternary_switchCase;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        //Kullanicidan kacinci ay oldugunu sorun ve ay ismini yazdirin

        //int ay=2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir rakam giriniz size hangi aya ait oldugunu soyleyeyim");
        int ay=scan.nextInt();

        switch (ay){
            case 1:
                System.out.println(ay+". ay Ocak ayidir...");
                break;
            case 2:
                System.out.println(ay+". ay Subat ayidir...");
                break;
            case 3:
                System.out.println(ay+". ay Mart ayidir...");
                break;
            case 4:
                System.out.println(ay+". ay Nisan ayidir...");
                break;
            case 5:
                System.out.println(ay+". ay Mayis ayidir...");
                break;
            case 6:
                System.out.println(ay+". ay Haziran ayidir...");
                break;
            case 7:
                System.out.println(ay+". ay Temmuz ayidir...");
                break;
            case 8:
                System.out.println(ay+". ay Agustos ayidir...");
                break;
            case 9:
                System.out.println(ay+". ay Eylul ayidir...");
                break;
            case 10:
                System.out.println(ay+". ay Ekim ayidir...");
                break;
            case 11:
                System.out.println(ay+". ay Kasim ayidir...");
                break;
            case 12:
                System.out.println(ay+". ay Aralik ayidir...");
                break;
            default:
                System.out.println("Allah'in adami!!! "+ay+". ay diye bir ay var mi?");
        }

    }
}
