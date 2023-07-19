package DateAndTimeAPI;

import java.time.*;

public class LaunchDt12 {
    public static void main(String[] args) {
        

        LocalDate date = LocalDate.now();
        System.out.println(date);

        int day = date.getDayOfMonth();
        int mon = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + "/" + mon + "/" + year);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int min = time.getMinute();
        int second = time.getSecond();

        System.out.println(hour + ":" + min + ":" + second);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

    }
}
