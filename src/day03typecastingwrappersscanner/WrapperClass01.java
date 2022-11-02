package day03typecastingwrappersscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
          Note : Java primitive lere methodlar ekliyerek yeni bi yapi olusturdu, bu yapiya "Wrapper Class"

                Primitive            Wrapper
                  byte         ==>     Byte
                  short        ==>     Short
                  int          ==>     Integer
                  long         ==>     Long
                  float        ==>     Float
                  double       ==>     Double
                  boolean      ==>     Boolean
                  ** char      ==>     Character

         */

        byte primitiveByte = 12; //primitiveByte yazip nokta koydugunuguzda hic method goremezsiniz, cunku primitive"ler method icermez sadece deger icerir.
        Byte wrapperByte = 12;  //wrapperByte yazip nokta koydugunuzda bir cok method gorursunuz, cunku "wrapper"lar method icerir

        //Example 1 : byte data type"inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println(Byte.MIN_VALUE); // -128
        System.out.println(Byte.MAX_VALUE); // 127

       // short,int,long data typleri nin en buyuk ve en kucuk degerlerini ekrana yazdiriniz.

        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.MAX_VALUE); // 2147483647

        System.out.println(Long.MIN_VALUE); // -9223372036854775808
        System.out.println(Long.MAX_VALUE); // 9223372036854775807


        //"primitive"ler nasil "wrapper"lara nasilir cevrilir. (Autoboxing)

        float f1 = 13.99F;
        Float wrapperF1 = f1;

        System.out.println(wrapperF1); //13.99

        // "wrapper"lar  nasil "primitive"lara cevrilir. (Unboxing)

        Character w1 = 's';
        char primitiveW1 = w1;

        //Note : Autoboxning ve Unboxning Java tarafindan otomatik, olarak yapilir.



    }
}
