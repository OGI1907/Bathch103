package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

   /*
        Not : char variable'leri matamatiksel islemlerde kullanirsaniz , Java onlarin ASCII degerlerini kullanir.
            Ornegin; System.outprintln ('A' + 'C'); ekrana AC yerine 132 yazdirir.

        note =  Java da '+' sembolunun iki anlami varidr. i)Toplama islemi ii)Birlestime islemi(Concanation)
                Java "+" sembolu gorunce once toplama yapmaya calisir, yapamazsa birlestime islemi yamaya calisir, o da olmazsa hata verir.



    */


    public static void main(String[] args) {


    //Example 1: Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz.
    //        Oguzhan Yildiz ==> OY

        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz");
        char ilk = input.next().charAt(0); //O

        System.out.println("Soy isminizi giriniz");
        char son = input.next().charAt(0);//C

        System.out.println("" + ilk + son);

     //2.Yol

        System.out.println("Tam isminizi giriniz");
        String tamIsim = input.nextLine();//Oguzhan

       char ilkHarf = tamIsim.charAt(0);

        System.out.println(ilkHarf);

       char soyIsminIlkHarfi = tamIsim.split("")[1].charAt(0);

        System.out.println(soyIsminIlkHarfi);


    }

}
