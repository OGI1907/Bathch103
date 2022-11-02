package day17arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taccedin");

        System.out.println(names); // [Tom,Thomas,Tahsin,Trumop,Taceddin]

        List<String> cities = new ArrayList<>();
        cities.add("Trabzon");
        cities.add("Tokyo");
        cities.add("Tokat");

        names.removeAll(cities); //removeAll method u ilk listeyi degistir
        System.out.println(names); // [Thomas,Tahsin]
        System.out.println(cities);// [Trump,Tom,Taceddin]

        List<String> Mynames = new ArrayList<>();
        names.add("Tom");
        names.add("Thomas");


        boolean sonuc1 = names.containsAll(Mynames); //ContainsAll kullanidgimzda heps varsa true aliriz
        System.out.println(sonuc1);

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        //ExAMPLE 1 : "a" listesinde "Shoes" elelmanin ilk gorunummunu siliniz.

        a.remove("Shoes");
        System.out.println(a);    //sadece birini siler

        //Example 2 : "a" listesinde "Shoes" elelmanin tum gorunummunu siliniz.

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);  //Hepsini birden siler.
        System.out.println(a);     //[TV,Radio,Laptop,Book]


        //Example 3 = Bir tane Salary list i olustrun eger Salary 1000 en az ise %20 1000'den cok ise %10 zam yapilir

        List<Double> salary = new ArrayList<>();  //Maas listesi olusturdum
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);

        //[12345.0,8674,5,15000,75,9500.0,20500.0]
        for (Double w : salary) { //Maas listesini bir index e atadim

            if (w < 10000) {       //Eger maas 10000 den az ise

                salary.set(salary.indexOf(w), w * 1.2);  //w*1.2(%20 zam yap)
            } else {                                    // yoksa
                salary.set(salary.indexOf(w), w * 1.1);  //w.1.1.(%10 zam yap)
            }
        }

        System.out.println(salary);

        //Example 4: Iki array in esit olu olmadigini kontrol eden kodu yaziniz.
        // Note : Iki ArrayList'in esit  olabilmesi icin,elemanlar esit olmali ve ayni elemanlar index te olmali
        List<Character> m = new ArrayList<>();

        m.add('x');
        m.add('a');
        m.add('z');

        List<Character> n = new ArrayList<>();

        n.add('x');
        n.add('y');
        n.add('z');

        //1.Way

       int counter = 0;

        for (int i = 0 ; i< m.size();i++){

         if (m.size()!=n.size()){
            counter++;
             System.out.println("Listler esit degildir");
             break;
         }

            if (m.get(i) != n.get(i));

            System.out.println("listler esit degildir");

            break;
        }
        if (counter==0) {
            System.out.println("Listler esittir");
        }

        //2.Yol:

        boolean esitMi = m.equals(n);

        if (esitMi){
            System.out.println("Listler esittir");
        }else {
            System.out.println("Listler esit degildir");
        }



    }
}