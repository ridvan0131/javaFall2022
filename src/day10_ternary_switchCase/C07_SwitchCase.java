package day10_ternary_switchCase;

import java.util.Scanner;

public class C07_SwitchCase {
    public static void main(String[] args) {
        //Kullanicidan SDET kisaltmasinda ki harflerden birini yazmasini isteyin .
        //Kullanici S girerse "Software"
        //Kullanici D girerse "Developer"
        //Kullanici E girerse "Engineer"
        //Kullanici T girerse "Testing"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen SDET kisaltmalarindan birisini giriniz: ");
        String kisaltma=scan.next().toLowerCase();
        char karakter=kisaltma.charAt(0);

        switch (karakter){
            case 's':
                System.out.println("Software");
                break;
            case 'd':
                System.out.println("Developer");
                break;
            case 'e':
                System.out.println("Engineer");
                break;
            case 't':
                System.out.println("Testing");
                break;
            default:
                System.out.println("Lutfen belirlenen karakterlerden birisini giriniz");
        }

    }
}
