package day12_stringManupulation;

import java.util.Scanner;

public class C01_Kendime {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle=scanner.nextLine();
        System.out.println("Lutfen bir har giriniz: ");
        char  harf=scanner.next().charAt(0);

        if (cumle.indexOf(harf)>=0){
            System.out.println(harf+" cumle de bulunuyor");
        }else {
            System.out.println(harf+ " cumlede bulunmuyor...");
        }
    }
}
