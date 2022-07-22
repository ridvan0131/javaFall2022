package day12_stringManupulation;

import java.util.Scanner;

public class C01_IndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz ardindan ENTER'e basarak bir harf giriniz: ");
        String cumle=scan.nextLine();
        char harf=scan.next().charAt(0);

        int index=cumle.indexOf(harf);
        if (index<0){
            System.out.println("girilen harf cumle icerisinde mevcuttur DEGILDIR");
        }else {
            System.out.println("Girilen harf cumle icerisinde DOLANIYOR");
        }

    }
}
