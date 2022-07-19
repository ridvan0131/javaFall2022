package day06_wrapper_ifBaslangic;

public class C01_WrapperClass {
    public static void main(String[] args) {

        int sayi1=10;
        Integer sayi2=20;

        String tel1="35733883";
        String tel2="47484939";

        System.out.println(tel1+tel2);//3573388347484939 yazacaktir,
        // Bu sayilari toplamak zorunda kalirsak,
        System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));//83218822
        // Integer yazarsak yanina nokta koydugumuz zaman degerini yada baska methodlari buluruz. ve int e cevirdi
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Double.MAX_VALUE);//1.7976931348623157E308
        System.out.println(Double.MIN_VALUE);//4.9E-324
        System.out.println(Float.MAX_VALUE);//3.4028235E38

        String caddeNo="B203";
        String sokakNo="1456";

        // System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
        // NumberFormatException stop execution yapacaktir,

    }
}
