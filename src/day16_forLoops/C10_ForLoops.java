package day16_forLoops;

import java.util.Scanner;

public class C10_ForLoops {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin
        //Girilen String'in palindrome olup olmadigini kontrol ediniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime=scanner.nextLine();


        if (terstenOku(kelime).contains(kelime)){
            System.out.println("Kelimemiz palindrome");
        }else {
            System.out.println("Kelimemiz palindrome DEGIL");
        }

    }

    private static String terstenOku(String kelime) {
        String tersKelime="";

        for (int i = kelime.length()-1; i >=0; i--) {
            tersKelime+=kelime.substring(i,i+1);
        }
        return tersKelime;

    }
}
