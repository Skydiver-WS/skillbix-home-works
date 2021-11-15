public class TopManager extends Company {
  private final double INCOME = 10000000;
  private final double BONUS = 1.5;
  @Override
  public void hire(String positionCompany, double salary) {
    if (getIncome() > INCOME){
      salary = salary * BONUS;
    }
    super.hire(positionCompany, salary);
  }
}
