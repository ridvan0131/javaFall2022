package day08_nestedIfElse;

import java.util.Scanner;

public class KendiKendime_02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir harf giriniz:");
        String karakter=scan.next().toLowerCase();

        boolean harf=karakter.charAt(0)>=97&&karakter.charAt(0)<=122;
        boolean sesliHarf=karakter.equals("a")||karakter.equals("e")||karakter.equals("i")||karakter.equals("o")||karakter.equals("u");

        if ((karakter.length()>1)||(!harf)){
            System.out.println(karakter+" bir harf degildir...");
        } else if (harf&&sesliHarf) {
            System.out.println("Girilen karakter SESLI HARFTIR");
        } else if (!sesliHarf) {
            System.out.println("Girdigniz karakter SESSIZZZ HARFTIR ");
        }

    }
}
