public class Main {
  public static void main(String[] args) {
    Employee manager = new Manager();
    Employee topManager = new TopManager();
    Employee operator = new Operator();
    while (manager.getListEmployee().size() < 80 || topManager.getListEmployee().size() < 10 || operator.getListEmployee().size() < 180) {
      double randomSalaryManager = 10000 + (Math.random() * (50000 - 10000));
      double randomSalaryTopManager = 100000 + (Math.random() * (500000 - 100000));
      double randomSalaryOperator = 10000 + (Math.random() * (30000 - 10000));
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
    System.out.println(topManager.getListEmployee().keySet() + "\n" + topManager.getListEmployee().size());
    topManager.fire("120");
    System.out.println(topManager.getListEmployee().keySet() + "\n" + topManager.getListEmployee().size());
  }
}