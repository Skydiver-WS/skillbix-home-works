import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneBook {

  private final TreeMap<String, String> treeMapName = new TreeMap<>();
  private final TreeSet<String> allContacts = new TreeSet<>();
  private final Pattern patternPhone = Pattern.compile("7\\d+");
  private final Pattern patternName = Pattern.compile("[A-Za-zА-Яа-яЁё]+");

  public void addContact(String phone, String name) {
    // проверьте корректность формата имени и телефона
    // если такой номер уже есть в списке, то перезаписать имя абонента
    Matcher matcherPhone = patternPhone.matcher(phone);
    Matcher matcherName = patternName.matcher(name);
    if (matcherPhone.matches() && matcherName.matches()) {
      for (String key : treeMapName.keySet()) {
        if (treeMapName.get(key).equals(phone)) {
          treeMapName.remove(key);
        }
      }
      treeMapName.put(name, phone);
    }
  }

  public String getNameByPhone(String phone) {
    // формат одного контакта "Имя - Телефон"
    // если контакт не найдены - вернуть пустую строку;
    String searchByPhone = "";
    for (String key : treeMapName.keySet()) {
      if (treeMapName.get(key).contains(phone)) {
        searchByPhone = key + " - " + treeMapName.get(key);
      }
    }
    return searchByPhone;
  }

  public Set<String> getPhonesByName(String name) {
    // формат одного контакта "Имя - Телефон"
    // если контакт не найден - вернуть пустой TreeSet
    allContacts.clear();
    if (treeMapName.containsKey(name)) {
      for (String key : treeMapName.keySet()) {
        if (key.equals(name)) {
          allContacts.add(key + " - " + treeMapName.get(key));
        }
      }
    }
    return allContacts;
  }

  public Set<String> getAllContacts() {
    // формат одного контакта "Имя - Телефон"
    // если контактов нет в телефонной книге - вернуть пустой TreeSet
    allContacts.clear();
    for (String key : treeMapName.keySet()) {
      allContacts.add(key + " - " + treeMapName.get(key));
    }
    return allContacts;
  }
}