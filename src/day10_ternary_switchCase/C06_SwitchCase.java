package day10_ternary_switchCase;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // Kullanicidan bir sayi girmesini isteyin
        // Girilen sayi 10 ise iki basamakli en kucuk sayi
        // Girilen sayi 100 ise uc basamakli en kucuk sayi
        // Girilen sayi 1000 ise dort basamakli en kucuk sayi
        // diger durumlarda "Girdigin sayiyi degistirin " yazdirin

        int sayi=100;
        switch (sayi){
            case 10:
                System.out.println("Girilen sayi iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("Girilen sayi uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("Girilen sayi dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistirin ");
        }
    }
}
