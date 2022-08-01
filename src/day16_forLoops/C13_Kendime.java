package day16_forLoops;

public class C13_Kendime {
    public static void main(String[] args) {
        // 1 den 4 e kadar olan sayilar yan yana ve 4 satir olacak sekilde ve aralarinda bir bosluk birakarak yazdirin

        for (int satir = 1; satir <=6 ; satir++) {
            for (int i = 1; i <=9 ; i++) {
                System.out.print(satir*i+" ");
            }
            System.out.println("");
        }




    }
}
