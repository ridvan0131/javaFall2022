package day12_stringManupulation;

import java.util.Scanner;

public class C07_Kendime {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin, Cumle buyuk kelimesi iceriyorsa tum cumleyi buyuk harf olarak
        // kucuk kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
        // iki kelimeyi de icermiyorsa cumle kucuk yada buyuk kalimesi icermiyor yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz: ");
        String cumle=scanner.nextLine().toUpperCase();

        if (cumle.contains("BUYUK")&&cumle.contains("KUCUK")){
            System.out.println("Karar verme zamani, buyuk yazalim dersen 1'e bas, yoksa 2 ye");
            int ayirtEt=scanner.nextInt();
            if (ayirtEt==1){
                System.out.println(cumle);
            }else {
                System.out.println(cumle.toLowerCase());
            }
        }else if (cumle.contains("KUCUK")){
            System.out.println(cumle.toLowerCase());
        }else if (cumle.contains("BUYUK")){
            System.out.println(cumle);
        }else {
            System.out.println("cumle kucuk yada buyuk kalimesi icermiyor");
        }

    }




}
