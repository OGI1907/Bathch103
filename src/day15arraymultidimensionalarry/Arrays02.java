package day15arraymultidimensionalarry;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array deki "en buyuk negatif ve "en kucuk pozitif elamani bulunuz

        int arr[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr); // --->>> [-12,-5,-2,0,18,23]

        int maxNegative = arr[0];   //Burada en buyuk negatifi ariyorum
        int minPositive = arr[arr.length-1]; //Burada en kucuk pozitifi ariyorum
        for (int w : arr) { // for la w ya deger atiyorum

            if (w<0){ //Eger W 0 dan kucukse
                maxNegative = Math.max(maxNegative, w);
            }

            if (w>0){ // eger w 0 DAN BUYUKSE
                minPositive = Math.min(minPositive, w);

            }
        }
        System.out.println(maxNegative  + "and " + minPositive);

    }
}