package day02;

public class C02_SwapVariables {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=20;

        System.out.println("baslangicta sayi1="+sayi1+ "ve sayi2="+sayi2);

        int bos;
        bos=sayi2;
        sayi2=sayi1;
        sayi1=bos;

        System.out.println("sonucta sayi1="+sayi1+ "ve sayi2="+sayi2+" oldu");




    }
}
