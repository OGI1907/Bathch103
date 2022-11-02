package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz isimin ilk ve son harfini ekrana yazdiriniz.
        //                 Oguzhan ==>  On

        Scanner imput = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = imput.next();

     //1.Yol
       char ilkHarf = isim.charAt(0);
       char sonHarf = isim.charAt(isim.length()-1); //Yazddiginiz code sadece bazai durumlar icin calisirsa o code'a "Hard Coding" denir.
                                                    // Yazdiginiz code her durum icin calisirsa o code'a "Dynmamic Coding" denir

        System.out.println("" + ilkHarf + sonHarf);

     //2.Yol

     String ilk = isim.substring(0,1);
     String son = isim.substring(isim.length()-1);
     System.out.println("" + ilk + son);

     //Example 2 : Verilen String'deki tum hayvan isimlerini ekrana yazdiridniz

        //              "Ben kedi esim tavuk oglum inek sever"

        String str = "Ben kedi,esim tavuk, oglum sever inek";

       //substring() in iki kullanimi vardir.
       //1)subrstring(baslangic indexi,bitis indexi) String'in ortasindan bir parca alamaya yarar.
       //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar
        String kedi = str.substring(4,8);
        String tavuk = str.substring(15,20);
        String inek =str.substring(34);

        System.out.println(kedi+tavuk+inek);

        //Example 3 : Ilk isim ve soyisimi iceren isimlerden ilk ve soyisimlerin basharflerini ekrana yazdiridiniz
        //                       Oguzhan Yildiz

        System.out.println("Ilk ve Soy isminizi giriniz");
        String tamIsim = "Oguzhan Yildiz";

        String ilkHarf1 = tamIsim.substring(0,1);
        String ilkHarf2 = tamIsim.substring(8,9);

        System.out.println(ilkHarf1+ilkHarf2);


        System.out.println("************************************************************************************");


        //Example 4 :
        System.out.println("Ilk ve Soy ismini giriniz");
        String tamisim01 = imput.next();

        String a = tamisim01.substring(0,1);
        String b = tamisim01.split("") [1].substring(0,1);
        System.out.println(a+b);
    }

}