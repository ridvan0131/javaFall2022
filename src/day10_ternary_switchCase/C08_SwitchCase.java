package day10_ternary_switchCase;

import java.util.Scanner;

public class C08_SwitchCase {
    public static void main(String[] args) {
        //Kullanicidan gun ismi alalim ve haftaici yada haftasonu yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birisini giriniz: ");
        String orjinalGun=scan.nextLine();
        String gun = orjinalGun.toLowerCase();


        System.out.println("*************IF-ELSE*******************");

        if (gun.equals("pazartesi")||
                gun.equals("sali")||
                gun.equals("carsamba")||
                gun.equals("persembe")||
                gun.equals("cuma"))
            System.out.println(orjinalGun + " HAFTA ICI bir gundur");
        else if (gun.equals("cumartesi")||
                gun.equals("pazar"))
            System.out.println(orjinalGun+ " HAFTA SONU bir gundur");
        else {
            System.out.println("Mantikli bir gun ismi girelim, yazimi kontrol edelim...");
        }

        System.out.println("*************TERNARY*******************");

        System.out.println(
                        (gun.equals("pazartesi")||
                        gun.equals("sali")||
                        gun.equals("carsamba")||
                        gun.equals("persembe")||
                        gun.equals("cuma"))?(orjinalGun + " HAFTA ICI bir gundur"):
                                ((gun.equals("cumartesi")||
                                  gun.equals("pazar"))?(orjinalGun+ " HAFTA SONU bir gundur"):
                                        ("Mantikli bir gun ismi girelim, yazimi kontrol edelim...")));

        System.out.println("*************SWITCH-CASE*******************");

        switch (gun){
            case "pazartesi":
                System.out.println(orjinalGun + " HAFTA ICI bir gundur");
                break;
            case "sali":
                System.out.println(orjinalGun + " HAFTA ICI bir gundur");
                break;
            case "carsamba":
                System.out.println(orjinalGun + " HAFTA ICI bir gundur");
                break;
            case "persembe":
                System.out.println(orjinalGun + " HAFTA ICI bir gundur");
                break;
            case "cuma":
                System.out.println(orjinalGun + " HAFTA ICI bir gundur");
                break;
            case "cumartes":
                System.out.println(orjinalGun + " HAFTA SONU bir gundur");
                break;
            case "pazar":
                System.out.println(orjinalGun + " HAFTA SONU bir gundur");
                break;
            default:
                System.out.println("Mantikli bir gun ismi girelim, yazimi kontrol edelim...");
        }


    }
}
