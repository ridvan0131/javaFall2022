package day07_ifElse;

import java.util.Scanner;

public class C04_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir ucgenin kenar uzunlugunun birincisini giriniz, \n ilk kenar uzunlugun sonrasi enter'e basiniz ");
        double kenar1=scan.nextDouble();
        //System.out.print("Lutfen bir ucgenin kenar uzunlugunun ikincisini giriniz: ");// yazmaya gerek yok
        double kenar2=scan.nextDouble();
        //System.out.print("Lutfen bir ucgenin kenar uzunlugunun ucuncusunu giriniz: ");// yazmaya gerek yok
        double kenar3=scan.nextDouble();

        if (kenar1==kenar2&&kenar2==kenar3){
            System.out.println("Verilen kenar uzunluklari bir eskenar ucgene aittir...");
        }else {
            System.out.println("Verilen kenar uzunluklari bir eskenar ucgene ait DEGILDIR...");
        }

    }
}
