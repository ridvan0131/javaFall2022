package day11_stringManupulation;

public class C02_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1="ali";
        String str2="can";
        String str3="Ali Can";
        String str4=str1+" "+str2;
        System.out.println(str4);// ali can
        System.out.println(str3==str4);// false
        System.out.println(str3.equalsIgnoreCase(str4));// true

    }
}
