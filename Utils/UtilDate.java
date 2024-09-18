package Utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author jprod
 */
public class UtilDate {
    public static int calculateYears(LocalDate date) {
        return calculateYears(date, LocalDate.now());
    }
    
    public static int calculateYears(LocalDate startDate,LocalDate endDate) {
        return Period.between(startDate, endDate).getYears();
    }
    
    public static LocalDate stringToLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(date, formatter);
    }
    
    public static String localDatetoString(LocalDate date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
    
}
