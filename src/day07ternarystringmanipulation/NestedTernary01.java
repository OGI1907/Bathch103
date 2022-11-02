package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
               Verilen yilin "Leap Year "(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
               i) Yil 100'e bolunurse 400 e de bolunmelidir ==> 1600+  1800-
               ii) Yil 100'e bolunmezse 4 e bolnumelidir.==> 1996+ 2001-
         */

        int year = 1600;

        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");

        System.out.println(leap);

        /*
        Asagidaki kurallara gore passwordun gecerli olup olmadigini kontrol eden kodu yaziniz.

        i)Sekiz karekterden fazla karekter varsa ilk harfi 'i' olmalidir.
        ii) Sekiz karekterden az karekter varsa ilk harfi 'k' olmalidir
         */

        String pwd = "K2a3";
        char ilkHarf = pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (ilkHarf=='K' ? "Gecerli" : "Gecersiz") : (ilkHarf=='i' ? "Gecerli" : "Gecersiz");

        System.out.println(gecerli);
    }
}
