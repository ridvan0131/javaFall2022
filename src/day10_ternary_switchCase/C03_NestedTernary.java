package day10_ternary_switchCase;

import java.util.Scanner;

public class C03_NestedTernary {
    public static void main(String[] args) {
        // Eger calisan kadinsa 60 yasindan buyuk oldugundna emekli olabilir
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi sonra ENTER'a basarak cinsiyetinizi giriniz Erkek ise E Kadin ise K yaziniz");
        double yas=scan.nextDouble();
        String irtibat=scan.next().toUpperCase();
        char cinsiyet= irtibat.charAt(0);

        System.out.println((cinsiyet!='E' && cinsiyet!='K')?("Cinsiyeti dogru girelim..."):
         ((cinsiyet=='E')?((yas>=65)?("Ey erkek'im emekli olabilirsin"):("Erkek adam "+yas+" yasinda daha calismali")):
          (yas>=60)?("Ey kadin'im neden hala calisiyorsun, emekli ol gari"):("Kadinlar "+ yas+" yasinda hala calismali")));

    }
}
