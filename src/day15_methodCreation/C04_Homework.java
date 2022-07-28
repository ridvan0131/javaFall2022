package day15_methodCreation;

import java.util.Scanner;

public class C04_Homework {
    public static void main(String[] args) {
        /*
		 Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
			- @ isareti icermiyorsa gecersiz email yazdirin
			- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
			- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
		 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz: ");
        String mail=scanner.next();

        sifreKontrolu(mail);
    }
    private static void sifreKontrolu(String mail) {
        if (!mail.contains("@")){
            System.out.println("Gecersiz email...");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("Lutfen gmail adresinizi giriniz...");
        }else if (!mail.endsWith("@gmail.com")){
            System.out.println("Lutfen gmail adresinizi duzgun bir sekilde giriniz.");
        }else {
            System.out.println("Gmail adresiniz sistemimize kaydedilmistir...");
        }
    }
}
