package day03typecastingwrappersscanner;

public class TypeCasting01 {

    //Type Casting : Bir numeric data type"ini diger numeric data type"ina cevirmek demektir.
    //               byte < short < int < long < float < double
    //                Kucukten ===> Buyuge = Auto Widening                    byte ====> int
    //                Buyukten ===> Kucuge = Explicit Norrowing denir.        float ===> long

    public static void main(String[] args) {

       //AUTO WIDENING
           byte age = 23;
           int newAge = age;


           // EXPLICIT NORROWING
           long population = 1234;
           int newPopulation = (int) population;


       // Example 1: short"u double ceviren kodu yaziniz

            short boy = 180;
            double yeniBoy = boy;  //AUTO WIDENING

       //            float"i byte yapan kodu yaziniz.

            float fiyat = 12.99F;
            byte yeniFiyat = (byte) fiyat;  // EXPLICIT NORROWING

        System.out.println(yeniFiyat); //12 ===> Java ondalik sayiyi, tam sayiya cevirirken yuvarlama islmei yapmaz.
                                      //         Java ondalik sayiyi, tam sayiya ceviriken ondalik kismini siler.

        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber); //3 ===> Java 515"i 256 (byte daki sayilarin sayiya) ya kalani return etti.



        int num = 510;
        byte newNum = (byte) num;
        System.out.println(newNum); //-2
    }



}
