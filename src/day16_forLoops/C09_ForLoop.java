package day16_forLoops;

import com.sun.jdi.connect.spi.TransportService;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan bir String isteyin, ve Stringi tersine ceviren bir method yaziniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime = scanner.nextLine();

         System.out.println(tersCevir(kelime));
    }

    public static String tersCevir(String kelime) {
        String tersKelilme="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
            tersKelilme+=kelime.substring(i,i+1).toLowerCase();
        }
        return tersKelilme;

    }
}
