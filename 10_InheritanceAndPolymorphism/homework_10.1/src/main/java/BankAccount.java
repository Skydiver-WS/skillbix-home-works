public class BankAccount {
  private Double amount = 0.0;
  private boolean send = false;

  public double getAmount() {
    return amount;
  }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount += amountToPut;
    }
  }

  public void take(double amountToTake) {
    if (amount > 0 && amountToTake < amount) {
      amount -= amountToTake;
      send = true;
    }
  }

  public boolean send(BankAccount receiver,  double amount) {
    receiver.take(amount);
    return send;
  }
}
