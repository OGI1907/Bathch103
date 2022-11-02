package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Bir String deki "m karekteteri haric tum karekterleri yazdiriniz
        //Andromeeda ===> Androeda

        String str = "Andromeda";

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c != 'm') {
                System.out.println(c);
            }
        }

        //2.Yol:

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == 'm') {
                continue;//Bosveeeer! ==> Loop un icinde bazi degerler icin Loop un calismamsini istersiniz "continue" kullaniniz
            }
            System.out.println(c);
        }

        //Ecample 2: 1 den 100 e kadar tum tam sayilari ekrana yazidiriniz 6 ile bolunenler haric tum tam sayilari ekrana yazdiriniz

        for (int i = 1; i < 101; i++) {  // i sayisi 1 i temsil eder // i den 100 e kadar tam sayilari // artma halinde

            if (i % 6 == 0) {   // 100 tam sayi icerisinde 6 ya bolunenler varsa onu "contiue" ile kaldir
                continue;

            }
            System.out.print(i + " ");

            //Example 3; Size verilen bir String deki 'm' den once yazilan karektrerleri yazdiriniz.
            //              Luxemburg ==> Luxe

            String s = "Luxemburg";

            for (int i2 = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'm') {
                    break;
                }
                System.out.println(c);
            }
        }
    }
}