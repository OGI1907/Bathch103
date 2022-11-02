package day15arraymultidimensionalarry;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //binarySearch() Method : Bu methodu kullanarak bir elamanin Array de olu olmadigini anlariz
        //                        binarySearch() Method'unu kullanmadan once mutalaka "Arrays.sort()" kullanmalidir
        //                        binarySearch() Method u aradiginiz eleman Array de varsa o elamainin indexini return eder.

        //                        binarySearch() Method u tekrarlayan elemanlar icin kullanilmaz.
        int arr [] = {12,31,43,14};

        int sayi = 43;

        Arrays.sort(arr);  //Elemanlari buyukten kucuge siralar // [12,14,31,43 ]

        Arrays.binarySearch(arr,sayi); //Bu array de 43 u arastir
        int idx1 = Arrays.binarySearch(arr,sayi);
        System.out.println(idx1);  //3  //Aradigim elemaanin sirasi


        int sayi2 = 17 ;     //Bu array de 17 yi arastir
        int sonuc = Arrays.binarySearch(arr,sayi2);

        System.out.println(sonuc); //-3   //Aradigim eleman yoksa (-) seklinde gosterir ve pozitif sayiya gore  kacinci sirada oldugunu gosterir
    }
}
