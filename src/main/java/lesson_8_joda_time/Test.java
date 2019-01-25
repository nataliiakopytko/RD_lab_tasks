package lesson_8_joda_time;

import org.joda.time.DateTime;
import org.joda.time.DateTimeComparator;
import org.joda.time.format.DateTimeFormat;

import java.util.Locale;

public class Test {
    public void convertData(String template){
        DateTime dateTime = DateTime.parse(template, DateTimeFormat.forPattern("yyyy-MM-dd"));
        System.out.println("Data before conversion: " + template);
        System.out.println(dateTime.toString("dd-MM-yyyy"));
        System.out.println(dateTime.toString("dd/MM/yyyy"));
    }

    public void startDay(){
        DateTime dateTime = new DateTime();
        DateTime startEndTime = new DateTime(dateTime).withTimeAtStartOfDay();
        System.out.println(startEndTime.getMillis());
        System.out.println(startEndTime.plusHours(23).plusMinutes(59).plusSeconds(59).getMillis());
    }

    public void convertDateToString(String template){
        DateTime dateTime = new DateTime().withMillis(1548367199000l);
        System.out.println(dateTime.toString(template));
    }

    public void compareDate(String date1, String date2){
        DateTime dateTime = new DateTime();
        int result = DateTimeComparator.getInstance().compare(dateTime.toString(date1), dateTime.toString(date2));
        switch (result) {
            case -1:
                System.out.println(date1 + " is less than " + date2);
                break;
            case 0:
                System.out.println(date1 + " is equal to " + date2);
                break;
            case 1:
                System.out.println(date1 + " is greater than " + date2);
                break;

            default:
                break;
        }
    }

    public String returnDayOfWeek(long day){
        DateTime longDay = new DateTime(day);
        DateTime.Property text = longDay.dayOfWeek();
        String name = text.getAsText(Locale.getDefault());
        System.out.println(name);
        return name;
    }
}
