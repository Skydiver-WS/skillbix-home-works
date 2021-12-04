import java.util.*;

public class Company {
  private double incomeCompany;
  private final HashMap<Employee, Double> listEmployee = new HashMap<>();

  public void hire(Employee employee) {
    listEmployee.put(employee, employee.getMonthSalary());
  }

  public void hireAll(Company company) {
    listEmployee.putAll(company.getListEmployee());
    company.fire(company.listEmployee.size());
  }

  public void fire(Integer positionCompany) {
    if (listEmployee.size() >= positionCompany) {
      ArrayList<Employee> arrayList = new ArrayList<>(listEmployee.keySet());
      for (int numberKey = 0; numberKey < positionCompany; numberKey++) {
        listEmployee.remove(arrayList.get(numberKey));
      }
    }
  }


  public HashMap<Employee, Double> getListEmployee() {
    return listEmployee;
  }

  public double getIncomeCompany() {
    return incomeCompany;
  }

  public void setIncomeCompany(double incomeCompany) {
    this.incomeCompany += incomeCompany;
  }

  public List<Employee> getTopSalaryStaff(int count) {
    List<Employee> listKeyEmployee = new ArrayList<>();
    ArrayList<Map.Entry<Employee, Double>> sortedList = new ArrayList<>(listEmployee.entrySet());
    sortedList.sort(new Comparator<Map.Entry<Employee, Double>>() {
      @Override
      public int compare(Map.Entry<Employee, Double> o1, Map.Entry<Employee, Double> o2) {
        return (int) (o2.getValue() - o1.getValue());
      }
    });
    if (count > 0 && count < sortedList.size()) {
      for (Map.Entry<Employee, Double> key : sortedList) {
        listKeyEmployee.add(key.getKey());
      }
      return listKeyEmployee.subList(0, count);
    }
    return new ArrayList<>();
  }


  public List<Employee> getLowestSalaryStaff(int count) {
    List<Employee> listKeyEmployee = new ArrayList<>();
    ArrayList<Map.Entry<Employee, Double>> sortedList = new ArrayList<>(listEmployee.entrySet());
    sortedList.sort(Map.Entry.comparingByValue());
    if (count > 0 && count < sortedList.size()) {
      for (Map.Entry<Employee, Double> key : sortedList) {
        listKeyEmployee.add(key.getKey());
      }
      return listKeyEmployee.subList(0, count);
    }
    return new ArrayList<>();
  }
}