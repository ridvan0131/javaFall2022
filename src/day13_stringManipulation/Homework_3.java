package day13_stringManipulation;

import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        /*
		 Soru 3) Kullanicidan isim isteyin. Eger
			- isim �a� harfi iceriyorsa �Girdiginiz isim a harfi iceriyor�
			- isim �Z� harfi iceriyorsa �Girdiginiz isim Z harfi iceriyor�
			- isim �a� ve  �Z� harfi iceriyorsa �Girdiginiz isim a ve Z harfi iceriyor�
			- ikisi de yoksa �Girdiginiz isim a veya Z harfi icermiyor� yazdirin

		 */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz: ");
        String isim=scanner.nextLine();

        if (isim.contains("a")&&isim.contains("Z")){
            System.out.println("isminiz a ve Z harfi iceriyor");
        }else if (isim.contains("a")){
            System.out.println("isminiz a harfi iceriyor");
        }else if (isim.contains("Z")){
            System.out.println("isminiz Z harfi iceriyor");
        }else {
            System.out.println("isminiz a ve Z harfi ICERMIYOR");
        }
    }
}
