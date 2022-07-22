package day12_stringManupulation;

import java.time.chrono.MinguoDate;
import java.util.SimpleTimeZone;

public class C02_IndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin,
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olanini yazdirin
        //- Girilen kelime cumlede kullanilmamis
        //- Girilen kelime cumlede 1 kere kullailmis
        //- Girilen kelime cumlede 1 den fazla kullanilmistir.

        String cumle="Ali topu at, at Ali at";
        String kelime="ali";

        int index=cumle.indexOf(kelime);

        if (index<0){
            System.out.println("Girilen kelime cumlede kullanilmamistir");
        } else if (cumle.indexOf(kelime,index+1)<0) {
            System.out.println("Girilen kelime cumlede 1 kere kullailmistir");
        } else {
            System.out.println("Girilen kelime cumlede 1'den fazla kullailmistir.");
        }


    }
}
