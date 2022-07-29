package day16_forLoops;

public class C04_Kendime {
    public static void main(String[] args) {
        //100 den baslayarak 50 ye kadar olan sayilarin aralarina virgul koyarak yazdirin

        for (int i =100; i >=50 ; i--) {
            if (i!=50){
                System.out.print(i+", ");
            }else {
                System.out.print(i);
            }
        }
    }
}
