package day13_stringManipulation;

public class C03_Replace {
    public static void main(String[] args) {
        String str="Java ogrenmek cok kolay";
        System.out.println(str.replace(" ",""));//Javaogrenmekcokkolay
        System.out.println(str.replace("Java","matematik"));//matematik ogrenmek cok kolay
        System.out.println(str.replace("e","a"));//Java ogranmak cok kolay
    }
}
