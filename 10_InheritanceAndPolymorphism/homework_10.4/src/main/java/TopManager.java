public class TopManager extends Company implements Employee {
  private final double INCOME = 10000000;
  private final double BONUS = 1.5;
  @Override
  public void hire(String positionCompany, double salary) {
    if (getIncome() > INCOME){
      salary = salary * BONUS;
    }
    super.hire(positionCompany, salary);
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
