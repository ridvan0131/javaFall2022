package day14_methodCreations;

public class C01_MethodCreations {
    public static void main(String[] args) {

        //verilen iki sayinin toplamini ve carpimini yapip yazdiran iki ayri method olusturun

        int sayi1=65;
        int sayi2=5;

        carpma(sayi1,sayi2);

        toplama(sayi1,sayi2);
    }

    public static void carpma(int sayi1, int sayi2) {

        System.out.println("Girilen sayilarin carpimi= "+(sayi1*sayi2));
    }

    public static void toplama(int sayi1, int sayi2) {

        System.out.println("Girilen sayilarin toplami= "+ (sayi1+sayi2));
    }
}
