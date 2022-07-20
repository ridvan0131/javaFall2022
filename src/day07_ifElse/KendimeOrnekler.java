package day07_ifElse;

import java.util.Scanner;

public class KendimeOrnekler {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Almis oldugunuz notu giriniz: ");
        double not=scan.nextDouble();

        if (not>100||not<0){
            System.out.println("Gecerli bir not giriniz");
        } else if (not>=90) {
            System.out.println("Tebrikler AA aldiniz");
        } else if (not>=80) {
            System.out.println("Yine de tebrikler BB aldiniz");
        } else if (not>=70) {
            System.out.println("Kucuk de olsa tebrigi hakettin CC aldin");
        } else {
            System.out.println("Kaldin be ya... git durumuna agla...");
        }
    }
}
