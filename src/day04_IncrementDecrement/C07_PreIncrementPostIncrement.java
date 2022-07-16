package day04_IncrementDecrement;

public class C07_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;

        sayi--;
        System.out.println(sayi);//9 yapar

        int a=sayi--;
        System.out.println(a);// 9 oldu once
        System.out.println(sayi);//8 olacak, cunku once atama sonra decrement ozelligini yapacak

        System.out.println(--a);//8



    }
}
