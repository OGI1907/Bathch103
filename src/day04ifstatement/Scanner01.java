package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

      /*
       Kullanicidan ilk, ismini ve telefon numarasini aliniz ve asagidaki formatta ekrana yazdiriniz.

       Oguzhan
       0762724734



       */

      //  Scanner input = new Scanner(System.in);

      //1.YOL
       // System.out.println("Lutfen adinizi giriniz");
       // String name = input.next(); //next() methodu kullanicidan String datasi almak icin kullanilir

       // System.out.println("Lutfen orta adini giriniz");
       // String Out name = input.next();

       // System.out.println("Soy ismini giriniz");
       // String lastname = input.next();

       // System.out.println("Lutfen telefon numarinizi giriniz");
       // String telefon = input.next();

       // System.out.println(("Lutfen kimlik numarasini giriniz"));
       // String kimlikNumarasi = input.next();

       // System.out.println(name + "" + lastname);
       // System.out.println(telefon);


       // System.out.println("********************************************************");


        //2.Yol:
        //System.out.println("Ilk, orta ve soy isminizi giriniz");
        //String ilk = input.next();
        //String orta = input.next();
        //String soy = input.next();
        //String kimlik = input.next();


        //System.out.println(ilk + "" +orta + "" + soy);
        // System.out.println(kimlik);

        //System.out.println("***********************************************************");

      /*
      next() ile nextline() farki nedir?

      next() methodu kullanicadan gelen String'in sadece ilk kelimesini alir
      nextLine() methodu kullanicidan gelen String'in tamamini alir
       */

        //3.yol

        // System.out.println("Ilk,orta ve soy isminizi giriniz");
        // String tamIsim = input.nextLine();
        // System.out.println(tamIsim);

       //  System.out.println("Kimlik numaraniz giriniz");
       // String KimlikNumarasi = input.next();
       // System.out.println(kimlikNumarasi);

    }
}
