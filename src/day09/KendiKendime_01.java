package day09;

import java.util.Scanner;

public class KendiKendime_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yil giriniz ardindan ENTER'a basarak ayi rakam olarak giriniz: ");
        int yil=scan.nextInt();
        int ay=scan.nextInt();



        if (ay==1||ay==3||ay==5||ay==7||ay==8|ay==10||ay==12){
            System.out.println(yil+" yili "+ay+". ayi 31 gun cekiyor" );
        } else if (ay==4||ay==6||yil==9||ay==11) {
            System.out.println(yil+" yili "+ay+". ayi 30 gun cekiyor");
        } else if (yil%4==0&&ay==2){
            System.out.println(yil+" yili "+ay+". ayi 29 gun cekiyor");
        } else if (yil%4!=0&&ay==2){
            System.out.println(yil+" yili "+ay+". ayi 28 gun cekiyor");
        }else {
            System.out.println("Yil ve ayi belirlenen araliklarda giriniz");
        }

    }
}
