package day16_forLoops;

import java.util.Scanner;

public class C14_NestedForLoopHomework {
    public static void main(String[] args) {
        //Kullanicidan pozitif bir rakam girmesini isteyin, ve girilen rakama gore asagidaki sekli cizdirin
        /*

        *
        * *
        * * *
        * * * *

         */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir rakam giriniz: ");
        int satir=scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j =  1; j <= 1; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }



    }
}
