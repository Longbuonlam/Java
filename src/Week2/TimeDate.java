package Week2;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.time.Duration;

public class TimeDate {
    public static void main(String[] args) {
        //Current Date and Time
        Date date = new Date();
        String str = String.format("Current Date & Time: %tc", date);
        System.out.println(str);

        //Meeting Date Calculation
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Today is: "+sdf.format(date));
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime nextdate = today.plusDays(14);
        System.out.println("Next meeting is on: "+nextdate);

        //Time Conversion
        LocalDateTime local = LocalDateTime.of(2024,3,20,10,0,0);
        LocalDateTime est = local.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of("America/Chicago")).toLocalDateTime();
        LocalDateTime cet = local.atZone(ZoneId.systemDefault()).withZoneSameInstant(ZoneId.of("Europe/Madrid")).toLocalDateTime();
        DateTimeFormatter meeting = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("If local meeting time is: "+local.format(meeting));
        System.out.println("Convert to Eastern Standard Time(EST): "+est.format(meeting));
        System.out.println("Convert to Central European Time(CET): "+cet.format(meeting));

        //Duration until Meeting
        Duration duration = Duration.between(today,nextdate);
        long day = duration.toDays();
        long hour = duration.toHoursPart();
        long minute = duration.toMinutesPart();
        System.out.println("Duration until Meeting: ");
        System.out.println("Day: "+day);
        System.out.println("Hour: "+hour);
        System.out.println("Minute: "+minute);

    }
}
