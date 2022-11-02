package day11loops;

public class NestedLoop01 {

    public static void main(String[] args) {

        /*
        Example 1: Asagidaki cikityi verecek kodu yaziniz.

           week : 1
             Day :1
             Day :2
             Day:3

             ....

            week: 2
              Day :1
              Day : 2
              Day : 3

              ....
             week :3

             day; 1
             day : 2
             Day : 3
         */

        for (int i=1 ; i<5 ; i++){

            System.out.println("Week :" + i);

            for (int k=1; k<8 ; k++){
                System.out.println("Day :" + k );
            }
        }


   }


}
