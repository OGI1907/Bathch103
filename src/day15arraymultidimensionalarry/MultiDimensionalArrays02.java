package day15arraymultidimensionalarry;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

    public static void main(String[] args) {

        //MultiDimensionalArray kisa yoldan nasil olusuturulur?

        char arr [][] = {{'a','b'},{'C','D','E'}, {'?'} } ;

        System.out.println(Arrays.deepToString(arr));  // [ [a,b],[C,D,E],[?] ]

        //Bir String multidimensional array de icinde "a" olan elemanlari concole'a yazidriniz.

        String brr [][] = { {"learn","java","it"}, {"is","easy"}}; ////MultiDimensionalArray i olustrduk

        for (String[] w : brr){

            for (String k : w){ // [ "learn","java","it" ]

                if (k.contains("a")){   //Stringlerin icindeki a olan kelimeleri yazidir
                    System.out.println(k + " ");
                }
            }
        }



    }
}
