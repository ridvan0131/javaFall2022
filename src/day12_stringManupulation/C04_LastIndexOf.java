package day12_stringManupulation;

import java.util.Scanner;

public class C04_LastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olanini yazdirin
        //- Girilen kelime cumlede kullanilmamis
        //- Girilen kelime cumlede 1 kere kullailmis
        //- Girilen kelime cumlede 1 den fazla kullanilmistir.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();

        if(cumle.lastIndexOf(kelime)<0){
            System.out.println("Soylediginiz kelime Cumle icinde mevcut degildir");
        } else if (cumle.lastIndexOf(kelime,(cumle.lastIndexOf(kelime)+1))<0) {
            System.out.println("Girilen kelime cumlede 1 kere kullailmis");
        }else {
            System.out.println("Girilen kelime cumlede 1 den fazla kullanilmistir.");
        }
        System.out.println();
        System.out.println("***********************FARKLI BIR METHOD**************************");
        System.out.println();
        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);

        if (ilkIndex<0){
            System.out.println("Soylediginiz kelime Cumle icinde mevcut degildir");
        } else if (ilkIndex==sonIndex) {
            System.out.println("Girilen kelime cumlede 1 kere kullailmis");
        }else {
            System.out.println("Girilen kelime cumlede 1 den fazla kullanilmistir.");
        }
    }
}
