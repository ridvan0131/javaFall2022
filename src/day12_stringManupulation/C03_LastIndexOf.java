package day12_stringManupulation;

import java.util.Scanner;

public class C03_LastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);


        if (cumle.lastIndexOf(harf)<0){
            System.out.println("Cumlenizde yazdiginiz harf bulunmamaktadir...");
        }else {
            System.out.println("Harfiniz cumlede mevcut...");
        }

    }
}
