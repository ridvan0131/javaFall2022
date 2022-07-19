package dsay07_ifElse;

import java.util.Scanner;

public class C04_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir ucgenin kenar uzunlugunun birincisini giriniz: ");
        double kenar1=scan.nextDouble();
        System.out.print("Lutfen bir ucgenin kenar uzunlugunun ikincisini giriniz: ");
        double kenar2=scan.nextDouble();
        System.out.print("Lutfen bir ucgenin kenar uzunlugunun ucuncusunu giriniz: ");
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2&&kenar2==kenar3){
            System.out.println("Verilen kenar uzunluklari bir eskenar ucgene aittir...");
        }else {
            System.out.println("Verilen kenar uzunluklari bir eskenar ucgene ait DEGILDIR...");
        }

    }
}
