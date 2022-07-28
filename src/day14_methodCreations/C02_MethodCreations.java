package day14_methodCreations;

import java.util.Scanner;

public class C02_MethodCreations {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin,
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri mehtod yazdin
        //Kullaniciya us sorun,
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int sayi1=scanner.nextInt();
        System.out.print("Lutfen bir sayi daha giriniz: ");
        int sayi2=scanner.nextInt();

//        kareleri(sayi1,sayi2); sonradan silinebilir karakterler, oncesinde method olusturmak icin gerekli
//        kupleri(sayi1,sayi2);

        System.out.println("Sayilarin kareleri toplamini istiyorsaniz 2'ye\n" +
                "Sayilarin kupleri toplamini istiyorsaniz 3'e basiniz");
        int numara=scanner.nextInt();
        if (numara==2){
            kareleri(sayi1,sayi2);
        }else if (numara==3){
            kupleri(sayi1,sayi2);
        }else {
            System.out.println("Birader ya 2 ya 3 sec, killik yapma...");
        }

        }

    public static void kupleri(int sayi1, int sayi2) {
        int kupleriToplamiSonuc=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
        System.out.println("Kupler toplami= "+kupleriToplamiSonuc);
    }

    public static void kareleri(int sayi1, int sayi2) {
        int kareleriToplamiSonuc=sayi1*sayi1+sayi2*sayi2;
        System.out.println("Kareler toplami= "+kareleriToplamiSonuc);
    }

}
