public class Operator extends Company implements Employee{
  @Override
  public double getMonthSalary(String positionNumberEmployee) {
    if (getListEmployee().containsKey(positionNumberEmployee)){
      return getListEmployee().get(positionNumberEmployee);
    } else {
      return  0;
    }
  }
}
