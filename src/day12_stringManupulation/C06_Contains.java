package day12_stringManupulation;

import java.util.Scanner;

public class C06_Contains {
    public static void main(String[] args) {
        //Kullanicidan email adresini giriniz
        // mail@gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        // @gmail.com ile bitiyorsa "Email adresiniz kaydedildi"
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen e-mail adresinizi giriniz");
        String mail=scan.next();

        int uzunluk=mail.length()-10;
        int index=mail.lastIndexOf("@gmail.com");

        if (!mail.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        }else if (uzunluk==index){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("Yaziminizi kontrol ediniz");
        }
    }
}
