package day13_stringManipulation;

public class Homework_2 {
    public static void main(String[] args) {
        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //		String str1 = �$13.99�
        //		String str2 = �$10.55�
        //		ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1="$13.99";
        String str2="$10.55";
        str1=str1.replaceFirst("\\D","");
        str2=str2.replaceFirst("\\D","");

        System.out.println("Verilen iki degerin toplami= "+"$"+(Double.parseDouble(str1)+Double.parseDouble(str2)));
    }
}
