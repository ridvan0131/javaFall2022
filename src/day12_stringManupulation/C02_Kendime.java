package day12_stringManupulation;

import java.util.Scanner;

public class C02_Kendime {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olanini yazdirin
        //- Girilen kelime cumlede kullanilmamis
        //- Girilen kelime cumlede 1 kere kullailmis
        //- Girilen kelime cumlede 1 den fazla kullanilmistir.

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle=scanner.nextLine();
        System.out.print("Lutfen bir kelime giriniz: ");
        String kelime=scanner.next();

        if (cumle.indexOf(kelime)<0){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (cumle.indexOf(kelime,cumle.indexOf(kelime)+1)<0){
            System.out.println("Girilen kelime cumlede 1 kere kullailmis");
        }else {
            System.out.println("Girilen kelime cumlede 1 den fazla kullanilmistir.");
        }
    }
}
