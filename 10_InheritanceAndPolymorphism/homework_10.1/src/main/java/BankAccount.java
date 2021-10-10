public class BankAccount {
  private Double amount = 0.0;

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
    }
  }

  public boolean send(BankAccount receiver, double amount) {
    double bufferGetAmount = getAmount();
    receiver.take(amount);
    return bufferGetAmount > getAmount();
  }
}
