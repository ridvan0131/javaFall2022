package day12_stringManupulation;

import java.util.Scanner;

public class C03_Kendime {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
        //lastIndexOf()
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle=scanner.nextLine();
        System.out.print("Lutfen bir harf giriniz: ");
        char harf=scanner.next().charAt(0);

        if (cumle.lastIndexOf(harf)>0){
            System.out.println(harf+ " cumlede mevcuttur");
        }else {
            System.out.println(harf+ " cumlede mevcut DEGILDIR");
        }
    }
}
