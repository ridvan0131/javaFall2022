package day12_stringManupulation;

public class C05_Contains {
    public static void main(String[] args) {
        String cumle="Calisirsaniz, JAVA ogrenmek cok kolaydir";

        System.out.println(cumle.contains("ca"));//false
        System.out.println(cumle.contains("ogr"));//true
        System.out.println(cumle.contains(" k"));//true
    }
}
