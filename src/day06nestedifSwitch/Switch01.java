package day06nestedifSwitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

        /*
        Kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz.

          1===>Pazar         2====> Pazartesi
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte GunNo = input.nextByte();

        //1.Yol : if ile cozunuz.

        if (GunNo == 1){
            System.out.println("Pazar");
        }else if(GunNo == 2){
            System.out.println("Pazartesi");
        }else if (GunNo == 3){
            System.out.println("Sali");
        }else if (GunNo == 4){
            System.out.println("Carsamba");
        }else if (GunNo ==5 ){
            System.out.println("Persembe");
        }else if (GunNo ==6){
            System.out.println("Cuma");
        }else if (GunNo ==7){
            System.out.println("Cumartesi");
        }else {
            System.out.println("Gecerli gun sayisi giriniz");

            //2.yol Swicht ile cozunuz

            switch (GunNo) {

                case 1:
                    System.out.println("Pazar");
                    break;
                case 2:
                    System.out.println("Pazartesi");
                    break;
                case 3:
                    System.out.println("Sali");
                    break;
                case 4 :
                    System.out.println("Carsamba");
                    break;
                case 5 :
                    System.out.println("Persembe");
                    break;
                case 6 :
                    System.out.println("Cuma");
                case 7 :
                    System.out.println("Cumartesi");

                default:
                    System.out.println("Gecerli gun sayisi giriniz");




            }
        }
    }
}
