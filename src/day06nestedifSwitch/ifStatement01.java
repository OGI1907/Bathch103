package day06nestedifSwitch;

import java.util.Scanner;

public class ifStatement01 {

    public static void main(String[] args) {


        //Kullanicidan yas degerini alan ve yasin hani evrede olduunu asaidaki tabloya gore ekerana yazdiriniz

        //0-4 bebek
        //5 -12 cocouk
        // 13 - 20 genc
        // 21-30 yetiskin
        // Tanimlanmis evre

        Scanner input = new Scanner(System.in);
        System.out.println("Yas degerini giriniz");
        byte yas = input.nextByte();
        if(yas<0 ) {
            System.out.println("Gecerli yas giriniz");
        }else  if (yas<5) {
            System.out.println("bebek");
        }else if (yas<13 ) {
            System.out.println("cocuk");
        }else if ( yas<21) {
            System.out.println("genc");
        } else if (yas<31) {
            System.out.println("yetiskin");
        }else {
            System.out.println("taninmamis evre");

        }


    }

}

