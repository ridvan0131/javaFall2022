package day16_forLoops;

import java.util.Scanner;

public class C08_ForLoops {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin ve strini tersten yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime=scanner.next();

        for (int i=kelime.length()-1 ;  i >=0 ; i--) {
            System.out.print(kelime.substring(i,i+1));
        }
    }
}
