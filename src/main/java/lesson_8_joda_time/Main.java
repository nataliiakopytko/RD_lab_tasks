package lesson_8_joda_time;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();

        test.convertData("2019-01-24");

        test.startDay();

        test.convertDateToString("dd-MM-yyyy");

        test.compareDate("2019-01-28", "2019-01-25");

        test.returnDayOfWeek(1548367199000l);
    }
}
