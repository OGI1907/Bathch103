package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {

    public static void main(String[] args) {

        //Exampel 1 = "Anlik tarihi"(Current Date) ekrana yazdiran kodu yaziniz

        LocalDate currentDate = LocalDate.now();

        System.out.println(currentDate);  //Bugunun tarihi

        //Exampel 2 = "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz

        LocalTime currenTime = LocalTime.now();
        System.out.println(currenTime); //Su an ki saati verir

        // Example 3 =  "Anlik tarihi"(Current Date) ve  Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); //Su an ki zamani ve tarihi gosterir

        // Example 4= Japonya daki " Anlik tarihi"(Current Date) ve  Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz

        LocalDateTime currenDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTime);

        /// Exapmple 5 = Istanbul daki " Anlik tarihi"(Current Date) ve  Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currenDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currenDateTimeInIstanbul);

        //Example 6: Bugumdem 789 gun sonra emekli olacaginiza gore,emeklilik tarhini hesaplayan kodu yaziniz

        LocalDate countDate = LocalDate.of(2022, 10, 23);
        LocalDate retireDate = countDate.plusDays(789);
        System.out.println(retireDate);

        //Example 7 = Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz

        LocalDate dobOguzhan = LocalDate.of(1997, 10, 12);
        LocalDate dobSule = LocalDate.of(2001, 10, 16);

        Long diff = ChronoUnit.DAYS.between(dobOguzhan, dobSule);
        System.out.println(diff);

        // Example 8: Istanbul,un fethi ile Cumhuruyet in fethi arasindaki arasinda kac oldugunu gosteren kodu yaziniz.

        LocalDate IstabulunFethi = LocalDate.of(1453, 5, 29);
        LocalDate CumhuriyetinKurulusu = LocalDate.of(1923, 10, 29);

        Long aySaysi = ChronoUnit.MONTHS.between(IstabulunFethi, CumhuriyetinKurulusu);
        System.out.println(aySaysi);

        //Example 9: Verilen tarih,in hangi burcta oldugunu gosteren kodu yaziniz

        LocalDate myDate = LocalDate.of(1998, 1, 12);

        int day = myDate.getDayOfMonth();
        int month = myDate.getDayOfMonth();

        System.out.println(day + " " + month);

        if (day > 21 && month == 3) {
            {
                System.out.println("Koc");
            }
            if (day < 20 && month == 4) {
                System.out.println("Koc");
            } else if (day >= 21 && month == 4) {
                System.out.println("Boga");
            } else if (day >= 20 && month == 5) {
                System.out.println("Boga");
            }

        }
    }
}


