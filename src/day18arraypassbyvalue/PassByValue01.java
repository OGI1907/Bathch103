package day18arraypassbyvalue;

public class PassByValue01 {

  /*

  1) Java variable larin orjinal degerlerini korumak ister
  2) Variable method lar icinde kullanildiginda, Java method un icine orjinal degeri koymaz, odegerin kopyasini uretir
  ve method a kopyayi yollar. Method kopya ustunde degiuisklik yapar dolayisiyla variable in orjinal degeri korunmus olur
  Bu sisteme "Pass By Value" denir

   Note : Java "Pass by Value" kullanir
   Note : Bazi programlama dilleri orjinal degeri koruma altina almamastir,Bu is developer lara birakmistir.Bu tarz diller "Pass By Reference kullanir
   */

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);

       // static method olana "main method"un icindexki hersey
        // static olmalidir
        change (5);
        System.out.println(x);  //5

        int ucret = 100;

       ucret=  indirim(ucret); //90

        System.out.println(ucret) ;//100
    }
    public static void change(int a){    // Int a yi degistir

        System.out.println(a*3); // 3 katini al

    }

    //void disindaki "return" type larda method body si icinde
   //"return" keyword kullanmalidir-
    public static int indirim(int gomlekUcreti){

        return  gomlekUcreti - 10;
    }
}
