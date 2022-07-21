package day10_ternary_switchCase;

public class C09_SwitchCase {
    public static void main(String[] args) {
        //Harf olarak verilen notu rakama cevirelim
        char not='A';
        switch (not){
            case 'A':
                System.out.println("90-100 arasi");
                break;
            case 'B':
                System.out.println("80-90 arasi");
                break;
            case 'C':
                System.out.println("70-80 arasi");
                break;
            case 'D':
                System.out.println("60-70 arasi");
                break;
            case 'E':
                System.out.println("50-60 arasi");
                break;
            case 'F':
                System.out.println("0-50 arasi");
                break;
            default:
                System.out.println("Lutfen gecerli ve buyuk bir harf giriniz");
        }
    }
}
