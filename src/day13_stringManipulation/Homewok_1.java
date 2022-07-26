package day13_stringManipulation;

public class Homewok_1 {
    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak �  Java ogrenmek123 Cok guzel@  �
        // String�ini �Java ogrenmek cok guzel.� sekline getirin.

        String isim="  Java ogrenmek123 Cok guzel@  ";
        isim=isim.trim();
        isim=isim.replace("C","c");
        isim=isim.replaceAll("\\d","");
        isim=isim.replace("@",".");
        System.out.println(isim);

    }
}
