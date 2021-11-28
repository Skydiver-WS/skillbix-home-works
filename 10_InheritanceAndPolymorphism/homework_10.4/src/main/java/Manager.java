public class Manager extends Company implements Employee {
  private final double FIXED_PERCENT = 0.05;
  private final double LOW_INCOME_FOR_COMPANY = 115000;
  private final double HIGH_INCOME_FOR_COMPANY = 140000;


  @Override
  public void hire(String positionCompany, double salary) {
    double randomGenerateIncomeManager = LOW_INCOME_FOR_COMPANY + (Math.random() * (HIGH_INCOME_FOR_COMPANY - LOW_INCOME_FOR_COMPANY));
    setIncome(randomGenerateIncomeManager);
    super.hire(positionCompany, Double.parseDouble(String.format("%.2f", salary + (randomGenerateIncomeManager * FIXED_PERCENT)).replaceAll(",", ".")));
  }

  @Override
  public double getMonthSalary(String positionNumberEmployee) {
    if (getListEmployee().containsKey(positionNumberEmployee)){
      return getListEmployee().get(positionNumberEmployee);
    } else {
      return  0;
    }
  }
}
