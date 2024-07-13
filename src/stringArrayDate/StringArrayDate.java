package stringArrayDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class StringArrayDate {
    @SuppressWarnings("unused")
    public static void main(String[] args) throws Exception {
        // create String objects
        String name = "Rachel", name2 = "rachel";
        String surname = "White";
        // Some string function examples
        System.out.println(name.equals(surname)); // false
        System.out.println(name.equalsIgnoreCase(name2)); // true
        System.out.println(name + " " + surname); // Rachel White
        System.out.println(name.compareTo(surname)); // -5
        System.out.println(name.compareTo(name2)); // -32
        // -------------------------------------------------------------
        // int[] singleDimensionArray = new int[2];
        // singleDimensionArray[0] = 1;
        // singleDimensionArray[1] = 2;
        // //or
        // int[] singleDimensionArray2 = {1,2};

        // int[][] twoDimensionArray = new int[2][2];
        // twoDimensionArray[0][0] = 0;
        // twoDimensionArray[0][1] = 1;
        // twoDimensionArray[1][0] = 2;
        // twoDimensionArray[1][1] = 3;
        // //or
        // int[][] twoDimensionArray2 = {{0,1}, {2,3}};

        // -------------------------------------------------------------
        // Get the current date time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Create time object using of()
        LocalDate dateOf = LocalDate.of(2000, 12, 2);
        LocalTime timeOf = LocalTime.of(2, 30, 30);
        LocalDateTime dateTimeOf = LocalDateTime.of(2000, 12, 2, 2, 30, 30);
        // using parse
        LocalDateTime dateTimeParse = LocalDateTime.parse("2017-07-31T15:30");

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.of(17, 30, 20);
        LocalDateTime ldt = LocalDateTime.of(ld, lt);
        DateTimeFormatter fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("Formatter Default Locale: " + fmt.getLocale());
        System.out.println("Short Date: " + fmt.format(ld));
        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Medium Date: " + fmt.format(ld));
        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Long Date: " + fmt.format(ld));
        fmt = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Full Date: " + fmt.format(ld));
        fmt = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("Short Time: " + fmt.format(lt));
        fmt = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println("Medium Time: " + fmt.format(lt));
        fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("Short Datetime: " + fmt.format(ldt));
        fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println("Medium Datetime: " + fmt.format(ldt));
        fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.GERMAN);
        System.out.println(fmt.format(ldt));
        fmt = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("en", "IN"));
        System.out.println(fmt.format(ldt));
    }
}
