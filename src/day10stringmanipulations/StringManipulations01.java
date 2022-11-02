package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir";

        //startsWith("kola",5) kodu ilk 5 karekterden sonraki String e bakar ve o String in "kola ile baslayip baslmadigini kontrol eder.
        //"kola ile basliyorsa "true", baslamiyorsa "false" return eder.
        boolean b = a.startsWith("kola",5);
        System.out.println(b);

        //replace("a", "*"); kod String deki ilk "a" yi "*" e cevirir.
        //replace("a", "*") ; kod String deki tum "a" lari "*" e ceviri
        String c = a.replaceFirst("a","*");
        System.out.println(c); //J*va kolaydir

        //concat() method u iki tane String i birbirne yapistirmaya yarar.
        //"Concatenation" islemi iki turlu yapilabilir; i)+ ile ii)concat() ile
        // Java bir islem icin method uretmisse, o method'u kullanmak "best practice"dir
        String d = a.concat(" Anladin mi?");
        System.out.println(d); //Java kolaydir. Anladin mi?


        String e = "   Oguzhan Yildiz      ";
        System.out.println(e); //"   Oguzhan      Yildiz      "

        //trim() mehodu bir String'in bas ve sonundaki "space" karekterlerini siler, aradaki "Space" karekterlerine dokunmaz.
        String f = e.trim();
        System.out.println(f); //"Oguzhan Yildiz"

        String h = "Java";
        String i = "Lava";


        // h.compareTo(i) iki tane String i alfebetik(lexicograpic) olarak karsilastirir.
        // Buyuk harf e duyarlidir.
        //Buyuk harf kucuk harf'e duyarli olmasini istemezseniz h.compareToIngoreCase(i) ; kullanabilirsiniz
        // h.compareTo(i); kodda "h" nin alphabetik sirasindan "i" nin alfabetik sirasi cikarilir.
        int k = h.compareTo(i);
        System.out.println(k);

        //a.repeat(5) ; kodu "a" String'ini yanyana 5 kere yapistirir.
       //repeat(0) ; empty String return eder.
        String n = a.repeat(3);
        System.out.println(n);

    }
}
