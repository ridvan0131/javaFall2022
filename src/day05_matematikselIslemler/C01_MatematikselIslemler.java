package day05_matematikselIslemler;

public class C01_MatematikselIslemler {
    public static void main(String[] args) {
        System.out.println(4*(2+5)/2);//14
        System.out.println(4*(2+5)/3);//9 normalde 9.3333 seklinde cikar ama tum sayilar int ise sonuc int olacaktir.
        System.out.println(4*(2+5)/3.0);// icerisinde doble olursa sonuc double seklinde olacak ve 9.333333333333334

        int sayi1=5;
        int sayi2=2;
        double sayi3=2;

        System.out.println(sayi1/sayi2);//
        System.out.println(sayi1/sayi3);



    }
}
