package day10_ternary_switchCase;

import java.util.Locale;

public class C12_StringManupulation_ToLowerOrToUpper {
    public static void main(String[] args) {

        String isim="Ridvan Adakli";

        System.out.println(isim.toLowerCase());

        String isim2="aLi";// Ali yapalim
        System.out.println(""+isim2.toUpperCase().charAt(0)+isim2.toLowerCase().charAt(1)+isim2.toLowerCase().charAt(2));


    }
}
