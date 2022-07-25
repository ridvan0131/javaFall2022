package day12_stringManupulation;

import java.util.Scanner;

public class C06_Kendime {
    public static void main(String[] args) {
        //contains
        //Kullanicidan email adresini giriniz
        // mail@gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        // @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen gmail adresinizi giriniz: ");
        String email=scanner.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresinizi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==email.length()-10) {
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("adam gibi gmail adrsi gir, kafamizi bozma");
        }
    }
}
