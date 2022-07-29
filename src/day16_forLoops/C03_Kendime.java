package day16_forLoops;

public class C03_Kendime {
    public static void main(String[] args) {
        //Ekrana 10 ile 30 arasindaki sayilari aralarinda virgul olarak ayni satirda yazdirin.

        for (int i = 10; i <=30 ; i++) {
            if (i!=30){
                System.out.print(i+", ");
            }else{
                System.out.print(i);
            }
        }
    }
}
