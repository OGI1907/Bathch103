package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //Arrays lerin icine sadece "primitive data type leri ve reference" yerlestirebilir.

    public static void main(String[] args) {

        String str[] = new String[4];

        str[0] = "Java";
        str[1] = "did";
        str[2] = "suprise you";

        System.out.println(Arrays.toString(str));

        //Example 1 = String bir Array olusturunuz ve "Tom" ve "Tom dan oncek tum elamalari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christoper", "Tom", "Ali", "Rojda"}; //Array imizi ve icindeki elamalari olusturduk

        for (String w : arr) {       //Arrayimizi String e cevirdik

            System.out.println(w + " ");         //Stringimizi yazdiridirdik

            if (w.equals("Tom")) {                 //Eger Stringimizde tum kodlari  "TOM"a kadar yazdir ve Tom"a gelince
                break;                               //kodu bitir
            }
        }


        System.out.println();
        // Example 2 :String bir Array olusturunuz ve "Tom" ve "Jane haric tum elamalari ekrana yazdiriniz

        String arr1[] = {"Jane", "Mark", "Christoper", "Tom", "Ali", "Rojda"}; //Arrayimizi olusturduk

        for (String a : arr1) { // Strigimize yazdirdik

            System.out.println(a + " "); //Stringimize yazdirdik

            if (a.equals("Tom") || a.equals("Jane")) {   //Eger Strigimizde ki kodlar da Tom ve Jane yaziyorsa...
                continue;                            // bosver bu isimlerei yazdirma
            }

            System.out.print("a = " + a);      // Tom ve Jane haric tum isimleri  yazdirarak cikardim

        }

        System.out.println();



        //Example 3 : Kullanici ile beraber bir Array olusuturunuz ve icine data ekleyiniz.
        //            bir ogretmenin sinifindaki ogrencilerin isimlerin application a yuklemesini saglayan kadu yaziniz.

        Scanner input = new Scanner(System.in); //Kullanicidan veri almak icin input olusturdum
        System.out.println("Kac ogrenci ismi gireceksiniz"); //Kac ogrenci girecegimi yazdirdim
        int numOfStd = input.nextInt(); // Kac ogrenci girecegimi inputtan aldim

        String names[] = new String[numOfStd]; // Isimlere gore kac ogrenci oldugunu yazdirdim

        for (int i = 1; i <= numOfStd; i++) {

            System.out.println("Lutfen " + i + ". ogrenci ismini giriniz");
            System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

            String stdName = input.next();


            if (stdName.equalsIgnoreCase("Q")){
                break;
        }
            names[i-1] = input.next();
        }
        System.out.println(Arrays.toString(names));
    }
}