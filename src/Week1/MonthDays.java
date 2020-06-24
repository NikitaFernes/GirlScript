package Week1;

public class MonthDays {
    public static void main(String[] args) {

        java.time.YearMonth yearMonthObject = java.time.YearMonth.of(2012, 2);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        System.out.println(daysInMonth);
    }
}
