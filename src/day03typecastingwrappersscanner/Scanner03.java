package day03typecastingwrappersscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 1 : Kullanicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdorgenin kisa kenarini giriniz");
        int En = input.nextInt();

        System.out.println("Dikdorgenin uzun kenarini giriniz");
        int boy = input.nextInt();

        System.out.println( "Alan" + En * boy);
        System.out.println( "Cevre" + 2*(En + boy ));

    }
}
