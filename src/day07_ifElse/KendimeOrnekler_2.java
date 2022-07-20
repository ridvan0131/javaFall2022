package day07_ifElse;

import java.util.Scanner;

public class KendimeOrnekler_2 {
    public static void main(String[] args) {
        //Take three numbers from the user and print the greatest number
        Scanner scan=new Scanner(System.in);
        System.out.println("Uc tane numara giriniz, her birinden sonra ENTER'a basiniz");
        double s1=scan.nextDouble();
        double s2=scan.nextDouble();
        double s3=scan.nextDouble();

        if (s1==s3||s1==s2||s2==s3){
            System.out.println("Birbirine esit olmayan rakamlar giriniz...");
        } else if ((s1>s2&&s2>s3)||(s1>s3&&s3>s2)) {
            System.out.println("Girdiginiz rakamlarin en buyugu: "+s1);
        } else if ((s2>s1&&s1>s3)||(s2>s3&&s3>s1)){
            System.out.println("Girdiginiz rakamlarin en buyugu: "+s2);
        } else {
            System.out.println("Girdiginiz rakamlarin en buyugu: "+s3);
        }
    }
}
