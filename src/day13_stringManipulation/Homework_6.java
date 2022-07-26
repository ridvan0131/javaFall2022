package day13_stringManipulation;

import java.util.ListIterator;
import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {
        /*
		 Soru 6) Kullanicidan bir sifre girmesini isteyin.
		 Asagidaki sartlari sagliyorsa �Sifre basari ile tanimlandi�,
		 sartlari saglamazsa �Islem basarisiz,Lutfen yeni bir sifre girin� yazdirin
			- Ilk harf buyuk harf olmali
			- Son harf kucuk harf olmali
			- Sifre bosluk icermemeli
			- Sifre uzunlugu en az 8 karakter olmali

		 */
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir sifre giriniz: ");
        String sifre=scanner.next();
        char ilkHarf=sifre.charAt(0);
        char sonHarf=sifre.charAt(sifre.length()-1);
        if (ilkHarf<='Z'&&ilkHarf>='A'){
            if (sonHarf<='z'&&sonHarf>='a'){
                if (!sifre.contains(" ")){
                    if (sifre.length()>=8){
                        System.out.println("Sifre basarili...");
                    }
                }
            }
        }else {
            System.out.println("Islem basarisiz, Lutfen yeni bir sifre giriniz...");
        }
    }
}
