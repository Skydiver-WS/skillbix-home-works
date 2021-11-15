import java.util.Map;

public interface Employee {
  void hire(String positionCompany, double salary);
  void hireAll(Employee employee);
  void fire(String positionCompany);
  Map<String, Double> getListEmployee();
  double getMonthSalary(String positionNumberEmployee);
}