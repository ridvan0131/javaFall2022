package day11_stringManupulation;

public class C03_Length {
    public static void main(String[] args) {
        String isim="Ali Canogullarindan";
        System.out.println(isim.length());//19
        // verilen ismin son harfi nedir?
        System.out.println(isim.charAt(isim.length()-1));//n

        String isim2="";
        System.out.println(isim2.length());//0 yazacak, hicligin uzunlugu sifirdir herzamna

        String isim3=null;
        System.out.println(isim3.length());//.NullPointerException hatasi aliriz,
    }
}
