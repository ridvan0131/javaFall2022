package day16_forLoops;

import java.util.Scanner;

public class C09_Kendime {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin, ve Stringi tersine ceviren bir method yaziniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scanner.nextLine();

        // System.out.println(tersineCevirBak(kelime));// bu satiri sirf gorelim diye yaptik

    }

    private static String tersineCevirBak(String kelime) {
        String tersKonteynir="";

        for (int i = kelime.length()-1; i >=0 ; i--) {
           tersKonteynir+=kelime.substring(i,i+1);
        }

        return tersKonteynir;

    }
}
