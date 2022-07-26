package day13_stringManipulation;

public class C04_ReplaceAll {
    public static void main(String[] args) {
        String str="*Java 98ogrenmek c..ok k876olay";

        //replace all kullanalim

        str=str.replaceAll("\\d","");// \\d bize rakamlari ifade eder

        System.out.println(str);//*Java ogrenmek c..ok kolay

        str=str.replaceAll("\\s","x");
        System.out.println(str);

        str=str.replaceAll("\\W","");//

        System.out.println(str);

        str=str.replace("x"," ");
        System.out.println(str);
    }
}
