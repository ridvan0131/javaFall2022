package dsay07_ifElse;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz: ");
        int yas=scan.nextInt();
        if (yas<65){
            System.out.println("Emeklilik yasiniz gelmemis, calismaya devam...");
        }else {
            System.out.println("Emekli olabilirsin, istersen git yat istersen calis...");
        }
    }
}
