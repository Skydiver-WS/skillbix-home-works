public class CardAccount extends BankAccount {
  // не забывайте, обращаться к методам и конструкторам родителя
  // необходимо используя super, например, super.put(10D);
  private final double PERCENT = 0.01;

  @Override
  public void put(double amountToPut) {
    super.put(amountToPut);
  }

  @Override
  public void take(double amountToTake) {
    super.take(amountToTake + amountToTake * PERCENT);
  }
}
