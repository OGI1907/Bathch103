package day06nestedifSwitch;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
            Passsword'un ilk harfi buyuk ise
               'A' olursa gecerli password aksi halde gecersiz password


           Passsword'um ilk harfi kucuk harf ise
              'z' olursa gecerli password aksi halde gecersiz password

           Note = Java "nested" kodlari calistiriken cok zaman harcar, buna "Time Complexity" denir.
                 Bu yuzden "nested" kod yazmamaya calisiriz.


         */

        String password = "Axy12!";


        char ilkHarf = password.charAt(0);
        if (ilkHarf > 'A' && ilkHarf <= 'Z') {


            //          'A' >='A'             'A'     <='Z'
            if (password.charAt(0) > 'A' && password.charAt(0) <= 'Z') {

                if (password.charAt(0) == 'A') {
                    System.out.println("Gecerli Password");
                } else
                    System.out.println("Gecersiz Password");

            } else if (password.charAt(0) >= 'a' && password.charAt(0) < 'z')

                if (password.charAt(0) == 'z') {
                    System.out.println("Gecerli Password");
                } else {
                    System.out.println("Gecersiz Pssword");
                }
            else {
                System.out.println("Ilk karekter harf olmalidir");
            }

        }

    }

}



