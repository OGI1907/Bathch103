package day17arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array03 {

    public static void main(String[] args) {

        //Example 1: Bir List teki elemanlarin birbirne en yakin olna ikisni bulunuz
        //           [12,15,19,30,21] ==> 19 ve 21

        List<Integer> a = new ArrayList<>();

        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);
        System.out.println(a);

        Collections.sort(a);  //List'teki elemanlari kucukten buyuge dizebilmek icin kullanilir
        System.out.println(a);

           int minFark = Integer.MAX_VALUE;

        for (int i=0 ; i<a.size();i++){

            minFark = Math.min(minFark, a.get(i) - a.get(-1));

        }

        System.out.println(minFark);














    }
}
