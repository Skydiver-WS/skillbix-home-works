import java.util.Map;

public class Manager extends Company {
  private final double FIXED_PERCENT = 0.05;
  private final double LOW_INCOME_FOR_COMPANY = 115000;
  private final double HIGH_INCOME_FOR_COMPANY = 140000;


  @Override
  public void hire(String positionCompany, double salary) {
    double randomGenerateIncomeManager = LOW_INCOME_FOR_COMPANY + (Math.random() * (HIGH_INCOME_FOR_COMPANY - LOW_INCOME_FOR_COMPANY));
    setIncome(randomGenerateIncomeManager);
    super.hire(positionCompany, salary + (randomGenerateIncomeManager * FIXED_PERCENT));
  }
}
