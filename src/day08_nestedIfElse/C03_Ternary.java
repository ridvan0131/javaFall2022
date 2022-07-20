package day08_nestedIfElse;

public class C03_Ternary {
    public static void main(String[] args) {
        int x=10;
        String tekMiCiftMi=x%2==0 ?"Cift sayidir": "tek sayidir";
        System.out.println(tekMiCiftMi);

        System.out.println(x%2==0 ?"Cift sayidir": "tek sayidir");

        System.out.println();

        System.out.println(x>5?"Aferin":4);
    }
}
