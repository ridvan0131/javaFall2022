package day16_forLoops;

public class C03_ForLoops {
    public static void main(String[] args) {
        //Ekrana 10 ile 30 arasindaki sayilari aralarinda virgul olarak ayni satirda yazdirin.

        System.out.println("****************Farkli bir method-DINAMIK*******************");
        for (int i = 10; i <=30 ; i++) {
            if (i==30){
                System.out.print(i);
            }else {
                System.out.print(i+", ");
            }
        }
        System.out.println("****************Farkli bir method*******************");
        for (int i = 10; i <=29 ; i++) {
            System.out.print(i+", ");
        }
        System.out.print(30);

    }
}
