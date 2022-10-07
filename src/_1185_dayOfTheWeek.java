import java.time.LocalDate;

public class _1185_dayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year,month,day);
        String [] ss = {null, "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        return ss[localDate.getDayOfWeek().getValue()];
    }
}
