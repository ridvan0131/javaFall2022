package day13_stringManipulation;

import java.util.Scanner;

public class C01_StartsWith_EndsWith {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime alin,
        //Verilen cumlenin verilen kelime ile baslayip baslamadigini ve
        // bitip bitmedigini kontrol edin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String cumle=scanner.nextLine();
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime=scanner.next();

        if (cumle.startsWith(kelime)){
            System.out.println(cumle+ " "+ kelime+ " ile basliyor");
        }else{
            System.out.println(cumle+ " "+ kelime+ " ile baslamiyor");
        }
        if (cumle.endsWith(kelime)){
            System.out.println(cumle+ " "+ kelime+ " ile bitiyor");
        }else{
            System.out.println(cumle+ " "+ kelime+ " ile bitmiyor");

        }
    }
}
