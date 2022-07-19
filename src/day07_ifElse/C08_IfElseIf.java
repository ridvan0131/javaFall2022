package day07_ifElse;

import java.util.Scanner;

public class C08_IfElseIf {
    public static void main(String[] args) {
        //Kullanicidan maas icin bir teklif isteyin
        // Teklif 80000 uzeri ise kabul ediyorum
        // 60-80000 arasi ise Konusabiliriz
        // 60000 alti ise kabul edemem, deyiverin

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen vermek istediginiz maasi giriniz: ");
        int maas=scan.nextInt();

        if (maas>=80000){
            System.out.println("Verdiginiz maasi kabul ediyorum, ne zaman ise baslayabilirim");
        } else if (maas>=60000) {
            System.out.println("Konusabiliriz ama daha fazla olsaydi kesin evet derdim. yine de sukur");
        } else {
            System.out.println("Teklif ettiginiz rakami konusmaya bile gerek yok, siz kendinize beles isci ariyorsunuz, hadi bana by..");
        }
    }
}