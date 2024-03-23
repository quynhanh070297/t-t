package bai9;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Bai9_1
{

    // Viet chuong trinh lay ngay gio cua he thong va cac noi


    public static void main(String[] args)
    {

        //9.1 Lay ngay cua hien tai va he thong :
        // Asia/Tokyo, Austraylia/Sydney , America/Sao Palo
     //   ZonedDateTime a = ZonedDateTime.now((ZoneId.of(ASIA_TOKYO));
      //  System.out.println(a );

        //


        //9.2 Lay gio hien tai cua he thong :
        System.out.println( ZonedDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME) );

        //9.3 Tinh toan so ngay giua hai ngay :

        LocalDate start = LocalDate.parse("2023-06-01");
        LocalDate end   = LocalDate.parse("2023-06-15");
        long diffInDays = ChronoUnit.DAYS.between(start, end);

        System.out.println(diffInDays);

        //9.4 Tinh toan so ngay trong thang hien tai

        ZonedDateTime date =ZonedDateTime.now();
        int daysInMonth = date.toLocalDate().lengthOfMonth();
        System.out.println(daysInMonth);

        //9.5 Tinh toan so ngay trong nam hien tai

        int month =  Year.now().length();
        System.out.println(month);

        //9.6 Tinh toan chuyen mot chuoi ngay qua Local date

        LocalDate date8 = LocalDate.parse("2023-06-01");



        //9.7 Chuyen mot Local Date sang mot chuoi ngay
        String dateInString = "19590709";
        LocalDate date9 = LocalDate.parse(dateInString, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date9);
        // 9.8 Chuyen 1 chuoi LocalDateTime Sang mot chuoi ngay dd/MM/yyyy HH:mm:yy

//        LocalDateTime date10 = LocalDateTime.parse("2023-06-01");
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        //9.8 So sanh hai LocalDate tra ve int
        LocalDate date1 = LocalDate.parse("2017-06-26");
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2017-06-22");
        System.out.println(date2);
        System.out.println(date2.compareTo(date1));

        //9.9 So sanh hai thoi gian Local time

        LocalTime lt1 = LocalTime.of( 14 , 17 ) ;
        LocalTime lt2 = LocalTime.of( 21 , 29 ) ;

        boolean same = lt1.equals( lt2 ) ;

        //9.10

        LocalDateTime updatedTime;
        LocalDateTime now = LocalDateTime.now();

        updatedTime = now.plusHours(2);
        updatedTime = now.plusMinutes(20);
        updatedTime = now.plusSeconds(300);
        updatedTime = now.plus(Duration.ofMillis(8000));
        updatedTime = now.plus(20, ChronoUnit.HOURS);

        System.out.println(now);
        System.out.println(updatedTime);

        LocalDateTime updatedTime2;
        LocalDateTime now2 = LocalDateTime.now();

        updatedTime2 = now.minusHours(2);
        updatedTime2 = now.minusMinutes(20);
        updatedTime2 = now.minusSeconds(300);
        updatedTime2 = now.minus(Duration.ofMillis(8000));
        updatedTime2 = now.minus(20, ChronoUnit.HOURS);

        System.out.println(now2);
        System.out.println(updatedTime2);











//        //9.3 2015-09-28
//        System.out.println( LocalDate.now(ZoneId.of("Europe/Paris")) ); // rest zones id in ZoneId class
//
//        // 16
//        System.out.println( LocalTime.now().getHour() );
//
//        // 2015-09-28T16:16:23.315
//        System.out.println( LocalDateTime.now() );
    }

}
