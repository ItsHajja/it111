import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimesDates {

    public static void main(String[] args) {
        // keep it simple - let's display the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        // don't like that - I would like to see the month, day of the week and year

        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);

        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println(currentDay);

        // the year would have to be integer

        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);

        // we would like to know the number of the day - if the today is the 2nd of the month - 2

        int currentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println(currentDayNumber);

        System.out.println("Today is "+currentDay+ ", " +currentMonth+ " " +currentDayNumber+ "nd, " +currentYear+ "!!!");




    }
}
