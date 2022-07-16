package day04_IncrementDecrement;

public class C06_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        sayi++;
        sayi++;
        sayi++;
        System.out.println(sayi);//13
        //PreIncrement
        System.out.println(sayi++);//13 eder
        System.out.println(sayi);//14 olmus demektir
        //PostIncrement
        System.out.println(++sayi);//15 olur
        //PreDecrement
        System.out.println(sayi--);//15 olur
        System.out.println(sayi);//14
        //PostIncrement
        System.out.println(--sayi);//13




    }
}
