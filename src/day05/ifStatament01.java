package day05;

import java.util.Scanner;

public class ifStatament01 {

    public static void main(String[] args) {

        // Example 1 : Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu giriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayi giriniz");

        int s = input.nextInt();

        //1.yol
        if (s % 2 == 0) {

            System.out.println("Cift Sayi");

        }
        //"!=" demek "esit degil" demektir.

        if (s % 2 != 0) {
            System.out.println("Tek sayi");

        }

        //2.yol

        if (s % 2 == 0) {
            System.out.println("Cift Sayi");
        } else {
            System.out.println("Tek sayi");
        }

        // Example 2 : Bir sayinin negatif, pozitif veya notr oldugunu soyleyen kodu yazniz.

        System.out.println("Bir sayi Giriniz");
        double d = input.nextDouble();

        if (d>0) {
            System.out.println("Pozitif");

        }else if (d==0) {
            System.out.println("Notr");

        }else{
            System.out.println("Negatif");


    }
}
}