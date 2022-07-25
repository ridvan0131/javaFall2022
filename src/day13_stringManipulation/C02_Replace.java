package day13_stringManipulation;

public class C02_Replace {
    public static void main(String[] args) {
        // String olarak verilen 10000 sayisinin binden buyuk olup olmadigini kiyaslayin

        String sayi="10.000";
        sayi=sayi.replace(".","");

        if (Integer.valueOf(sayi)>1000){
            System.out.println("bulunan sonuc, 1000 den buyuk");
        }else {
            System.out.println("Bulunan sonuc 1000 den kucuk");
        }
    }
}
