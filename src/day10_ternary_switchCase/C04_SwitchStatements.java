package day10_ternary_switchCase;

import java.util.Scanner;

public class C04_SwitchStatements {
    public static void main(String[] args) {
        //Kullanicidan haftanin kacinci gunu oldugunu sorun, ve gun ismini yazdirin.

        int gun= 0;
        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Allah'in adami! hafta 7 gunden olusuyor, girdigin gun bunlardan birisi olsun...");

        }
    }
}
