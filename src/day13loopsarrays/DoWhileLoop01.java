package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        // Examole 1 : Kullanicidan bir sayi aldiniz, sayi 100 den kucuk ise ekrana "Kazandin!" yazdiriniz
        //             Aksi halde ekrana "Kaybettin!" yazdiriniz.
        //            Kullanici kazandikca oyuna devam etmeli

        Scanner input = new Scanner(System.in);
        int sayi = 0;

        do {
            System.out.println("Bir sayi giriniz");
            sayi = input.nextInt();

            if (sayi < 100) {
                System.out.println("Kazandiniz");
            }
        } while (sayi < 100);

        System.out.println("kaybettiniz!");

        //Example 2: Kullanicidan ismini aliniz ilk harfinin buyuk olup olmadigini kontrol ediniz


        do {
            System.out.println("Isim giriniz");
            char ilkHarf = input.next().charAt(0);

            if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
                System.out.println("Ismi basariyla girdiniz");
            } else {
                System.out.println("Ismi yanlis girdiginiz icin islem iptal edilmisitrír");
                break;
            }
        } while (true);


        //Infinite Loop : Sonsuz dongu

        //Artirma azaltma kisminda hata yaparsaniz "infinitive loop sorunsal'i olusur

        for (int i = 1; i < 4; i--) {
            System.out.println("Hi!");
        }

        //Artirma azaltma kismini yazmazsiniz "infinitive loop sorunsal'i olusur
        for (int i = 1; i < 4; ) {
            System.out.println("Hi");


            //Artirma azaltma kismini yazmazsiniz "infinitive loop sorunsal'i olusur
            int a = 12;
            while (a<15){
                System.out.println("Hi");
            }



        }
    }
}

