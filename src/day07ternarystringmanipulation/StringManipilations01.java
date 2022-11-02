package day07ternarystringmanipulation;

public class StringManipilations01 {

    public static void main(String[] args) {

          /*
                                                    String Class Methodlari

                1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
                            ii)equals() method'u "boolean" return eder.

                2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf kucuk harfe dikkat etmeden anlamamiza yarar.
                                      ii) equalsIgnoreCase() method'u "boolean" return eder.

               3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
                                 ii) toLowerCase() method'u "String" return eder

                4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
                                 ii) toUpperCase() method'u "String" return eder

                5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                             ii) charAt() method'u "char" return eder.

                6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
                            ii) length() method'u "int" return eder.

                7)contains(): i)Bir String'de belli bir characterin veya characterlerin var olup olmadigini anlamak icin kullanilir
                              ii) contains() method'u "boolean" return eder.

                8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
                           ii)split() method'u "Array" return eder.
         */

        /*
                Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                            i)En az 8 character icermeli
                            ii)Space characteri icermemeli
                            iii)Ilk harfi "M" veya "m" olmali
                            iv)Son characteri "?" olmali
               */

       //i) En az 8 character icermeli
        String password = "Manisa12?";
        boolean num = password.length()>7;

        //ii) Space characteri icermemli
        boolean second = !password.contains(" ");

        //iii) Ilk harfi "M" veya "m" olmali
        boolean third =password.charAt(0)=='M' ||password.charAt(0)=='m';

        //iv)Son chaaracteri "?" olmali.

        boolean fourth = password.charAt(password.length()-1)=='?';

        System.out.println(fourth && second && third && fourth);



    }
}