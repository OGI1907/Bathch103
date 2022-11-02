package day03typecastingwrappersscanner;

import java.io.InputStream;
import java.util.Scanner;

public class Scanner01 {

    //Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kullanmamizi saglar.
    // Scanner bir Java Class'dir, bu class i kullanabilmek icin "impor" etmek gerekir.
    // Scanner Class"i Hava"nin util kutuphanesidir.

    public static void main(String[] args) {

      //Kullanicidan data almak icin yapilmasi gerekenler

      //1.Adim: Scanner Class'indan object olusuturun
        Scanner input = new Scanner(System.in);

      //2.Adim: Kullaniciya ne yapacagini soyle
        System.out.println("Hey kullanici yasini gir ");

      //3.Adim = Kullanicidan aldiginiz data'yi bir variable koyun
      byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin " + age);


    }


}
