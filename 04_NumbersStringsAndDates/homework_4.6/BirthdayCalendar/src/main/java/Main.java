import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    int day = 31;
    int month = 12;
    int year = 1991;
    System.out.println(collectBirthdays(year, month, day));
  }

  public static String collectBirthdays(int year, int month, int day) {
    month = month - 1;
    Calendar calendar = new GregorianCalendar(year, month, day);
    Calendar currentTime = new GregorianCalendar();
    SimpleDateFormat dateFormat = new SimpleDateFormat(" - dd.MM.yyyy - EE", Locale.ENGLISH);
    int count = 0;
    String dateReturn = "";
    while (!(calendar.getTime().after(currentTime.getTime()))) {
      dateReturn += count++ + dateFormat.format(calendar.getTime()) + System.lineSeparator();
      calendar.roll(Calendar.YEAR, 1);
    }
    return dateReturn;
  }
}
