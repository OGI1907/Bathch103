package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasinda zman farkini hesaplayan kodu yaziniz

        LocalDateTime Japonya = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime Almanya = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long saatFarki = ChronoUnit.HOURS.between(Almanya,Japonya) ;
        System.out.println(saatFarki);

        //Example 2 = Sabit bir tarih olusturun

        LocalDate MyDate = LocalDate.of(2011,Month.JULY,3);
        System.out.println(MyDate);//2011-07-03

        /*
        1) Java da sabit datalari (Gun isimler,Ay isimleri,Amerika daki eyalet isimleri etc.) depolamak ve gerektiginde kullanmak icin depolar
        olusturuz.Bu depolara "Enum" denir
         */

        //Example 3 : USA icin "Woww", UK icin "Big","CANADA" icin "Cold","TURKEY" ICIN "Vatan",GERMNANY icin "ARABA"

        Countries country = Countries.GERMANY;

        switch (country){

            case USA :
                System.out.println("Woow");
                break;

            case TURKEY:
                System.out.println("Vatan");
                break;

                case GERMANY:
                System.out.println("Araba");
                break;
            default:

                System.out.println("Tanimlanmmais ulke");
        }
    }
}
