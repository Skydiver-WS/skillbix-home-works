public class Operator implements Employee{

  private double salary;

  public Operator(Double salary) {
    this.salary = salary;
  }

  @Override
  public double getMonthSalary() {
    return salary;
  }
}
