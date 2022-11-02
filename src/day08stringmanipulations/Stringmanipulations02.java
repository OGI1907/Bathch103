package day08stringmanipulations;

public class Stringmanipulations02 {

    public static void main(String[] args) {

        //Example 1 : Bir Stringdeki space haric kac tane character kullanilidigini gosteren kodu yaziniz.
        //            "Ali okula gitti. ====>14

        String str = "Ali okula gitti";

       // Example 1 = Bir String deki herhangi bir karekteri veya kerekterleri degistirmek icin kullanilir.
        int num = str.replace(" " , "").length();
             //Ali Okula Gitti      Aliokulagitti         //14
        System.out.println(num);

      // Example 2 = Bir String'deki tum 'a' harflerini 'A' ya ceviriniz

        String s = "Ankara nin tasina golzlerimin yasina bak";
        String yeniS = s.replace("a", "A");
        System.out.println(yeniS); //AnkArA'nin tAsinA gozlerimin yAsinA bAk.

        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz
        String t = "Kara kara dusunme Ankara";
        String yeniT = t.replace("kara", "*");
        System.out.println(yeniT);//Kara * dusunme An*

        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********
        String stdId = "AC202117004";
        String yeniStdId = stdId.replaceAll("[0-9]", "*");
        System.out.println(yeniStdId);// AC*********

       /*
        Bir grup data'yi ifade eden kodlara "Regex denir.
        "Regex Regular Extpressions in kisaltilmis halidir.

        1)Tum rakanmalar ==> (0-9)
        2)Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum harfler ==> [a-zA-Z]
        5) Sesli harfler ==> [aeiouAEIOU]
        6) sPACE ==> []
        7) Tum rakamlar ve tum harfler ==>[0-9a-zA-Z]
        8) Tum noktalama isaretleri ==> \\p{Punct}


         1)Rakamlar haric tum karakterler ==> [^0-9]
         2)Kucuk harfler haric tum karakterler ==> [^a-z]
         3)Buyuk harfler haric tum karakterler ==> [^A-Z]
         4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
          5)Space haric ==> [^ ]
        */

      //Example 5: Verilen bir String de kullanilan noktalma isareti ve rakamlar ve space karekteri haric tum karekterlerin sayisini bulan kodu yaziniz
      //                  tum karekterlerin sayisini bulan kodu yaziniz.

        String u = "Ali 13 yasinda, dersem inanma!...";

        int Sonuc = u.replaceAll("[0-9]" , "" ).  // Tum rakamlari sildim
                replace(" " , "" ).              // Burada tum bosluklari sildim
                replaceAll("\\p{Punct}", "").    // Tum noktalama isaretlerini sildim
                length();                                        // Kalan hepsini hesapladim
        System.out.println(Sonuc);


      //Example 6 : Bir password'un gecerli olup olmadigini asagidaki kurallara gore testeden kodu yaziniz.
      //            i)Space haric en az sekiz karekter olmali
      //            ii)En az 1 sembol icermeli
      //            iii) en az 1 rakam icermeli.
      //             iv) En az 1 buyuk harf icermeli
      //              v) En az 1 kucuk harf icermeli.

        String password = "B78cd? k!m";

       // i)Space haric en az sekiz karekter olmali
        boolean first = password.replace(" "," ").length()>7;
       // ii)En az 1 sembol icermeli
       boolean second = password.replaceAll(" [0-9a-zA-z ] " , "").length()>0;
       // iii) en az 1 rakam icermeli.
        boolean third = password.replaceAll("[^0-9]", "").length()>0;
       //   iv) En az 1 buyuk harf icermeli
        boolean five = password.replaceAll("[^A-Z]", "").length()>0;
       //     v) En az 1 kucuk harf icermeli.
        boolean six = password.replaceAll("[^a-z]","").length()>0;

        boolean passwordGecerli = first && second && third && five && six ;

        if (passwordGecerli) {
            System.out.println("Password unuz gecerlidir");
        }else{
            System.out.println("Password unuz gecerli degildir");
        }

        //Example 7 : Bir String'deki noktalama isaretleri haric karekter sayisini gosteren kodu yaziniz.
        String cumle = "Sen yapmazsan, ben yapmazsam, o yapmazsa kim yapacak?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(number);

       //Example 8: Verilen bir String "AL" ile baslliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin.
       //           aksi hlade "Normal" yazdirin.

       String v =  "Alex";

       boolean baslangic = v.startsWith("Al");

       boolean sonu = v.endsWith("x");

       String RESULT = baslangic && sonu ? "Harika " : "Normal ";

        System.out.println(RESULT);

     }

}
