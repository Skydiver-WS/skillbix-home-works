public class Operator implements Employee{

  private double salary;

  public Operator(Double salary) {
    this.salary = salary;
  }

  @Override
  public double getMonthSalary() {
    return Double.parseDouble(String.format("%.2f", salary).replaceAll(",", "."));
  }
}
