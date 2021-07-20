import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
  private final TreeSet<String> treeSet = new TreeSet<>();

  public void add(String email) {
    // TODO: валидный формат email добавляется
    Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
    Matcher matcher = pattern.matcher(email);
    if (matcher.matches()) {
      treeSet.add(email.toLowerCase());
    }
  }

  public TreeSet<String> getSortedEmails() {
    // TODO: возвращается список электронных адресов в алфавитном порядке
    return treeSet;
  }
}

  //=====================================================================================================================================


