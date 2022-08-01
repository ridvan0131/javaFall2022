package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        // Kullanicidan iki tam sayi alin,
        // Ilk sayidan baslayafrak ikinci sayiya kadar ucer ucer yazdirin
        // ikinci sayi dahil olmak zorunda degil

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz: ");
        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        if (sayi1>=sayi2){
            for (int i = sayi1; i >=sayi2; i-=3) {
                System.out.println(i);
        }
        }else if (sayi2>=sayi1){
            for (int i = sayi2; i >=sayi1; i-=3) {
                System.out.print(i+" ");
            }
        }else if (sayi1<0||sayi2<0){
            System.out.println("eksi rakam girme gardas");
        }

    }
}
