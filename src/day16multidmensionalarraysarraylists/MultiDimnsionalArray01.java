package day16multidmensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimnsionalArray01 {

    public static void main(String[] args) {


      /*
            Array veya Collection varsa "for each-loop kullanmak ilk tercihiniz olsun
            Array veya Collcetion var ama "index kullanmak zorundasiniz o zaman "for-each-loop" veya "while-loop" veya
            "do-while-loop" kullanmalisiniz
       */


        //Bir tane integer multidimensional array olusturunuz
        //Bir array deki tum sayilarin toplamani veren kodu yaziniz

        int arr[][] = {{2, 5, 1}, {32, 75}, };

        int sum = 0;

        for (int[] w : arr) { //{2, 5, 1}  {32, 75}

            for (int k : w) {

                sum = sum + k;
            }

            System.out.println(sum);

            //Bir multimensional array i normal array'e ceviren kodu yaziniz..
            // {2,5,1} , {32,75} ==> {2,5,1,32,75}

            int brr[][] = {{2, 5, 1}, {32, 75}, };

            int toplam = 0;

            for (int[] a : brr){

                toplam = toplam + w.length;  //MULTIDIMENSIONAL aRRAY ICINDEKI ELEMAN SAYISINI BULDUK O DA 5
            }

            System.out.println(toplam);

            int idx =0;
            int crr[] = new int[toplam]; //toplam [0,0,0,0,0]

            for (int[] a : brr){

                for (int k : w){

                    crr[0] = k;
                    idx++;
                }
            }

            System.out.println(Arrays.toString(crr));



















        }
    }
}