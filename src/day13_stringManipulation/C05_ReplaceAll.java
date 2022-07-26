package day13_stringManipulation;

public class C05_ReplaceAll {
    public static void main(String[] args) {
        String cumle="Java        cok              zevkli";
        cumle=cumle.replaceAll("\s+"," ");
        System.out.println(cumle);//Java cok zevkli

//        cumle=cumle.replaceAll("[a-e]"," ");
//        System.out.println(cumle);

        cumle=cumle.replaceAll("\\S","*");
        System.out.println(cumle);

        System.out.println(" ");
        String mmm="java 123456";
        System.out.println(mmm.replaceFirst("\\D","*"));// *ava 123456


    }
}
