package day11_stringManupulation;

public class C01_Equals {
    public static void main(String[] args) {
        int a=10;
        int b=a+0;

        System.out.println(a==b);// true

        char ch1='k';
        char ch2='k'+0;

        System.out.println(ch1==ch2);// true... deger olarak

        String str1="Ali";
        String str2="Can";
        String str3="Ali Can";
        String str4=str1+" "+str2;
        System.out.println(str4);// Ali Can
        System.out.println(str3==str4);// false
        System.out.println(str3.equals(str4));// true



    }
}
