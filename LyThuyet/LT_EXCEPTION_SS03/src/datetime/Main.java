package datetime;

import java.time.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // trước java 8
        Date date = new Date(); // trả về thời gian của hệ thống theo mili giây

        //dateTime API
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(today); // ngày tháng năm
        System.out.println(time); // giờ phút giây
        System.out.println(dateTime); // ngày tháng năm giờ phút giây
        System.out.println(zonedDateTime); // ngày tháng năm giờ phút giây theo múi giờ

        LocalDate bornIn = LocalDate.of(2006, 10, 06);
        Period age = Period.between(bornIn,today);
        System.out.println("Tuổi: " + age);
        LocalDate nextDate = bornIn.plusDays(100); // tính thời gian 100 ngày sau
        System.out.println(nextDate);
    }
}
