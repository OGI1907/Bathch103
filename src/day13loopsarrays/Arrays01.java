package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {

    public static void main(String[] args) {

        /*
        1) Ayini data tipinde, coklu data'i depolamakta  icin Java'nin olusturdugu yapilar vardir.
        Bu yapilanlardan birisi de "Array"dir.
         */


       //Array nasil olusturulur?
        int stdAges[]= new int[7];  // [0,0,0,0,0,0,0]

        //Array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        //Array'lere elemanlar nasil eklenir?

        stdAges[1] =11;
        stdAges[0]= 12;
        stdAges[2] =13;
        stdAges[3] =11;
        stdAges[4] =10;
        stdAges[5] =12;
        stdAges[6] =12;
        System.out.println(Arrays.toString(stdAges));

        //Array deki herhangi bir elamni nasil yazdirabiliriz?

        System.out.println(stdAges[4]);//10

        //Array deki en kucuk ve en buyuk elamni ekrana yazdiriniz.

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges)); //[10,11,12,12,12,13,14]

        int ilk =stdAges[0];

        //Note: lenght() String'lerde kullanilir, "lenght" Arry'lerde kullanilir
        int son = stdAges[stdAges.length-1];
        System.out.println(ilk+son);


        //Example 2: stdAges Array'i icindeki tum elamanlarin toplamini ekrana yazdiran kodu yazizniz.

        int sum = 0;

        for (int i = 0 ; i<stdAges.length ; i++ )

            sum = sum + stdAges[i];

        //2.Yol : while-loop

        int i =0;

        int toplam =0;

        while (i<stdAges.length){

            sum = sum + stdAges[i];

        }

        System.out.println(toplam);

        //3.Yol : do-while-loop

        int k =0;

        int s = 0;

        do {

            s = s + stdAges[k];
           k++;
        }while (k< stdAges.length);
        System.out.println(s);

        //4.Yol: for each loop Arry lerde ve Collectionslar da kullanilir

        int  t = 0;
        for (int w : stdAges){

            t = t + w;
            System.out.println(t);
        }

        //Example 3 : String bir array olusturunuz

        //            Bu Array'e 5 tane isim yerlestiriniz
        //            Bu ismlerdeki karekter sayilarinin toplamini ekrana yazdiriniz.

        String stdNames[] = new String[5];

        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";

        int karekterSayilariToplami = 0;
        for (String w :stdNames){
            karekterSayilariToplami = karekterSayilariToplami + w.length();
        }
        System.out.println(karekterSayilariToplami); //18


        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 elaman ekleyiniz
        //           Bu array deki sadece buyuk harfleri olusturunuz

        char ch[] = {'A','c','D','k','m'};

        for (char w : ch){

            if (w>'A' && w<='Z'){
                System.out.println(w);
            }
        }


















    }
}
