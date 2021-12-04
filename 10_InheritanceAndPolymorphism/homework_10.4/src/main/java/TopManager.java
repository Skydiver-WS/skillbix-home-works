public class TopManager implements Employee {
  private final double INCOME = 10000000;
  private final double BONUS = 1.5;
  private double salary;


  public TopManager(Company company, Double salary) {
    if (company.getIncomeCompany() > INCOME) {
      this.salary = salary * BONUS;
    } else {
      this.salary = salary;
    }
  }

  @Override
  public double getMonthSalary() {
    return Double.parseDouble(String.format("%.2f", salary).replaceAll(",", "."));
  }
}
