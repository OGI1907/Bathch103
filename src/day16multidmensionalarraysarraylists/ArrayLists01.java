package day16multidmensionalarraysarraylists;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*

    Arraylist ler ayni data tipine sahip birden fazla data yi depolamak icin kullanirlir.
    Array ile ArrayList'in farki nedir?
    1) Array olusutrurken Array in icine kac tane eleman koymamiz erektigini soylemeliyiz, soyledidigimiz eleman sayisindan fazla eleman koyamayiz

        Array ler eleman sayina "fixed" dirler

        Arraylist´leri olusuturken eleman sayiisi soylemeye greke yok, cunku Arraylist'ler eleman sayisina "flexible(esnek) dirlar.
        2)Array lerin icine *primitive" ve "referece lar konabilir
          Arraylist'lerin icine ise sadece "non-primitive" ler konulur.

        3) Array ler super fast ve cok hizli. Array ler memory i cok az kullanilir
        Note : Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
        elaman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin


     */


    public static <ArrayListz> void main(String[] args) {

        //1.Yol;
        ArrayList<Integer> ages = new ArrayList<Integer>();
        //2.Yol
        ArrayList<Integer> heights = new ArrayList<Integer>();
        //3.Yal :
        List<Integer> nums = new ArrayList<>();

        //ArrayList ler nasil yazdirilir?
        System.out.println(nums); // []

        //ArrayList'lere nasil eleman eklenir?
        //add() her zaman elemani en sona ekler (insertion order)
        nums.add(21);
        nums.add(18);
        nums.add(20);

        System.out.println(nums); //21

        nums.add(1,50);     //Eger sonradan numara eklemek istersem bu methodu kullanmam gerekir
        System.out.println(nums); // [21,50,18,20]

       List<Integer> prices = new ArrayList<>();
       prices.add(23);
       prices.add(185);

       nums.addAll(prices);
        System.out.println(nums);  // [21,50,18,20,23,185]
        System.out.println(prices); // [23,185]

        nums.addAll(2, prices);
        System.out.println(nums); //[21,50,23,185,18,20,23,185]

        //ArrayList'lerin eleman sayisi nasil bulunur?
        int elemanSayisi = nums.size();
        System.out.println(elemanSayisi); //8

        //ArrayList'lerde herhangi bir elaman nasil secilir?
        int el1 = nums.get(3);           //get methodu istenen bir index teki elemani verir.
        System.out.println(el1); //185

        //ArrayList'in  bosa olup olmadigini nasil anlariz?

        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2); //true

        //ArrayList de bir eleman nasil degistirilir?
        nums.set(3,200);
        System.out.println(nums);//[21,50,23,200,18,20,23,185]

        //Example 1 : nums ArraysList deki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz

        for (int w : nums) {        //  [21,50,23,200,18,20,23,185]

            if (w%2!=0){

                nums.set(nums.indexOf(w) , w+11);
            }
        }

        System.out.println(nums); // [32, 50, 34, 200, 18, 20, 34, 196]


        //remove() mehod un icine tamsayi koyarsaniz Java onu index olarak kabul eder.

        //Example 2: ArrayList den 200 elemanini siliniz.
        //Note 1 : Tum tamsayilar Java icin aksi soylenmedikce primetive dir. yani int dir
        //Note 2 : Primitive ler ArrayListler in elamani olamazlar
        //Note 3: "primitive"i Wrapper Class'a ceviiriseniz,non-primitive olur ce non primitive ler ArrayList lerin elamani olur,index olamaz

        Integer sayi = 200;
        nums.remove(sayi);
        System.out.println(nums);






















    }
}
