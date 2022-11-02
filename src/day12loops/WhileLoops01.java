package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {

        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

        //1.Yol:
        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Yol:
        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int k = 17;
        while (k > 3) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }
            k--;
        }

        //Example 12 den 14 e kadar yazan kodun toplamini veren kodu yaziniz

        int sum = 0 ;
        int a = 12 ;

        while (a<15){

            sum = sum + a;


            a++;
        }

        System.out.println(sum); //2212


        //Example 4 : Size verilen bir tamsayini rakamlari toplamini ekrana yazdiran kodu giriniz

        int sonuc = 0;
        int sayi = 385;

        while (sayi>0){

            sonuc = sonuc + sayi%10;
            sayi = sayi/10;
        }
        System.out.println(sonuc);

        //Lullanicidan aldiginiz bir sayinin carpim tablosunu  ekrana yazdiriiz


        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek icin bir sayi giriniz");
        int s = input.nextInt();

        int n = 1;
        while (n<11){

            System.out.println(s + "x" + n + "=" + s*n);
            n++;
    }









    }
}