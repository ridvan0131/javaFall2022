package day02;

public class C03_SwapVariables2 {
    public static void main(String[] args) {

        int sayi1=15;
        int sayi2=20;

        System.out.println("baslangicta sayi1="+sayi1+ "ve sayi2="+sayi2+" idi");

        sayi1=sayi2-sayi1;
        sayi2=sayi2-sayi1;
        sayi1=sayi2+sayi1;

        System.out.println("sonucta sayi1="+sayi1+ "ve sayi2="+sayi2+" oldu");

    }
}
