public class Main {
  public static void main(String[] args) {
    Manager manager = new Manager();
    TopManager topManager = new TopManager();
    Operator operator = new Operator();
    while (manager.getListEmployee().size() < 80 || topManager.getListEmployee().size() < 10 || operator.getListEmployee().size() < 180) {
      double randomSalaryManager = Double.parseDouble(String.format("%.2f", (10000 + (Math.random() * (50000 - 10000)))).replaceAll(",", "."));
      double randomSalaryTopManager = Double.parseDouble(String.format("%.2f", (100000 + (Math.random() * (500000 - 100000)))).replaceAll(",", "."));
      double randomSalaryOperator = Double.parseDouble(String.format("%.2f", (10000 + (Math.random() * (30000 - 10000)))).replaceAll(",", "."));
      if (manager.getListEmployee().size() < 80) {
        manager.hire("Manager", randomSalaryManager);
      }
      if (topManager.getListEmployee().size() < 10) {
        topManager.hire("Top Manager", randomSalaryTopManager);
      }
      if (operator.getListEmployee().size() < 180) {
        operator.hire("Operator", randomSalaryOperator);
      }
    }
    topManager.hireAll(manager);
    topManager.hireAll(operator);
    System.out.println(topManager.getListEmployee().size());
    topManager.fire("120");
    System.out.println(topManager.getListEmployee() + " " + topManager.getListEmployee().size());
    System.out.println(topManager.getMonthSalary("Operator id:96"));
    System.out.println(monthSalary(topManager, "Top Manager"));

  }
  public static double monthSalary (Employee employee, String test){
    return employee.getMonthSalary(test);
  }
}