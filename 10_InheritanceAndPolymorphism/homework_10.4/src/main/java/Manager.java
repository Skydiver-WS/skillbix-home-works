public class Manager implements Employee {
  private double salary;
  private final double FIXED_PERCENT = 0.05;
  private final double LOW_INCOME_FOR_COMPANY = 115000;
  private final double HIGH_INCOME_FOR_COMPANY = 140000;

  public Manager(Company company, Double salary) {
    double randomIncome = LOW_INCOME_FOR_COMPANY + (Math.random() * (HIGH_INCOME_FOR_COMPANY - LOW_INCOME_FOR_COMPANY));
    company.setIncomeCompany(randomIncome);
    this.salary = salary + FIXED_PERCENT * randomIncome;
  }

  @Override
  public double getMonthSalary() {
    return Double.parseDouble(String.format("%.2f", salary).replaceAll(",", "."));
  }
}
