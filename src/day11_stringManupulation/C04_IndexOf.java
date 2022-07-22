package day11_stringManupulation;

public class C04_IndexOf {
    public static void main(String[] args) {
        String isim="Calisirsaniz Java ogrenmek cok kolay";
        System.out.println(isim.indexOf('s'));//4
        System.out.println(isim.indexOf("s"));//4
        System.out.println(isim.indexOf("w"));//-1
        System.out.println(isim.indexOf("Java"));//13
        System.out.println(isim.indexOf('A'));//-1
        System.out.println(isim.indexOf('s',11));//-1
        System.out.println(isim.indexOf("a",15));//16


    }
}
