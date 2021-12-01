public class TopManager implements Employee {
  private final double INCOME = 10000000;
  private final double BONUS = 1.5;
  private double salary;

  public TopManager(Double salary) {
    this.salary = salary;
  }

  @Override
  public double getMonthSalary() {
    if (Company.income > INCOME){
      return salary * BONUS;
    }else {
      return salary;
    }
  }
}
