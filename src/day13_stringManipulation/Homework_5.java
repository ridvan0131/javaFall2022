package day13_stringManipulation;

import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {
        // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz: ");
        String kelime=scanner.next();

        if (kelime.length()!=4){
            System.out.println("Lutfen 4 harfli bir kelime kullaniniz");
        }else {
            System.out.println(kelime.substring(3)
                    +kelime.substring(2,3)
                    +kelime.substring(1,2)
                    +kelime.substring(0,1));
        }
    }
}
