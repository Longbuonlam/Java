package Week1;
import java.util.*;
import java.text.*;

public class DateTime {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String input = "2023-02-23";
        Date date;
        try {
            date = sdf.parse(input);
            System.out.println(input+" was "+date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
