package day06_wrapper_ifBaslangic;

import java.util.Scanner;

public class C08_IfSorulari_3 {
    public static void main(String[] args) {
        //Kullanicidan gun ismini al, haftaici yada haftasonu yazdir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun isimlerinden birisinin ismini giriniz");

        String gun=scan.next().toLowerCase();
        if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")){
            System.out.println("Girdiginiz gun: "+"Hafta ici");
        }
        if (gun.equals("cumartesi")||gun.equals("pazar")){
            System.out.println("Girdiginiz gun: "+"Hafta sonu");
        }




    }
}
