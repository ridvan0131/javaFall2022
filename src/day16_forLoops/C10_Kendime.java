package day16_forLoops;

import java.util.Scanner;

public class C10_Kendime {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin
        //Girilen String'in palindrome olup olmadigini kontrol ediniz

        Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen bir kelime giriniz: ");
        String kelime=scanner.nextLine();

        if (kelime.contains(palindromeMuBak(kelime))){
            System.out.println("Yeni kelime: "+kelime+" PALINDROME'dur");
        }else {
            System.out.println("Yeni kelime: "+kelime+" PALINDROME DEGILDIR");
        }
    }
    private static String palindromeMuBak(String kelime) {
        String kelimeninSonHali="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
            kelimeninSonHali+=kelime.substring(i,i+1);
        }
        return kelimeninSonHali;
    }
}
