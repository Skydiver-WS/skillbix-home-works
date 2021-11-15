import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class Company implements Employee {
  private int idNumber = 1;
  private static double income;
  private final HashMap<String, Double> listEmployee = new HashMap<>();

  public void hire(String positionCompany, double salary) {
    if (salary >= 0) {
      if (listEmployee.containsKey(positionCompany)) {
        listEmployee.put(positionCompany + " id:" + idNumber++, salary);
      } else {
        listEmployee.put(positionCompany, salary);
      }
    }
  }

  public void hireAll(Employee employee) {
    this.listEmployee.putAll(employee.getListEmployee());
    employee.fire(String.valueOf(listEmployee.keySet().size()));
  }

  public void fire(String positionCompany) {
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(positionCompany);
    if (matcher.matches() && listEmployee.size() >= Integer.parseInt(positionCompany) && Integer.parseInt(positionCompany) > 0) {
      ArrayList<String> arrayList = new ArrayList<>(listEmployee.keySet());
      for (int numberKey = 0; numberKey < Integer.parseInt(positionCompany); numberKey++) {
        listEmployee.remove(arrayList.get(numberKey));
      }
      arrayList.clear();
    } else {
      listEmployee.remove(positionCompany);
    }
  }

  public HashMap<String, Double> getListEmployee() {
    return listEmployee;
  }

  public double getMonthSalary(String positionNumberEmployee) {
    return getListEmployee().get(positionNumberEmployee);
  }

  public static double getIncome() {
    return income;
  }

  public static void setIncome(double income) {
    Company.income = income;
  }

}