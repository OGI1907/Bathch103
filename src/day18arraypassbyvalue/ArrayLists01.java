package day18arraypassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {


        //Exemple 1 : Bir Integer ArrayList deki 7 haric tum elemanlari 2 artiriniz

        List<Integer> ages = new ArrayList<>();

        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages) {

            if (w == 7) {
                continue;
            }
            // w = w+2;  ==> List ler boyle update edilmezler
            ages.set(ages.indexOf(w), w + 2);
        }

        System.out.println(ages);

        //Example 2 : Size verilen ArrayList te 8 ve 8 den oceki tum elelmanlari 2 katina cikiniz


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for (Integer w : nums) {  //Sayilara deger veriyoruz

            nums.set(nums.indexOf(w), w * 2);//8 dahilse sout if in ustune haric durumunda if in altina yazilir
            if (w == 8) { //eger sayi 8 ise
                break;    //loop u kir
            }

        }
        System.out.println(nums);







































    }


}
