package day11loops;

public class Forloop01 {

    //Example 1 = 3 den 6 ya kadar tam sayilarin toplamini bulan kodu yaziniz.

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;
        }

        // System.out.println(sum) ; Loop un disina yazilirsa "sum"in sadece son degerini ekrana yazdirir
        // System.out.println(sum) : Loop un icine yazilirsa her bir loop icin "sum'un hangi degerler oldugunu yazirdirir.
        System.out.println(sum); //Her zaman loop disina koy sonucu direk gormek istersen


        //Example 2: 6 dan 3 a kadar tamsayilarin carpimini kodu yaziniz.

        int multiply = 1;
        for (int a = 6; a > 2; a--) {
            multiply = multiply * a;


        }

        System.out.println(multiply);

        //Example 3 : Size verilen bir tamsayinin rakamlari toplamini bulunuz¨.

        int num = 385;

        int sonuc = 0;
        for (int i = 385; i > 0; i = i % 10) {

            sonuc = sonuc + i % 10;

        }

        System.out.println(sonuc);

        //Example 4: Size verilen bir String i ters ceviren kodu yaziniz.
        //            "Kaba" == "abak"

       String str = "Kabak";
        String ters = "";

        for (int i = str.length() - 1; i > -1; i--) {

            char c = str.charAt(i);

            ters = ters + c;


        }
    }
}