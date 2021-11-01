public abstract class Client {
    protected double amount;

    public double getAmount() {
        return amount;
    }

  public void put(double amountToPut) {
    if (amountToPut > 0) {
      amount += amountToPut - getDepositCommission(amountToPut);
    }
  }

  public void take(double amountToTake) {
    if (amountToTake > 0 && amount > amountToTake) {
      amount -= amountToTake + getWithdrawalCommission(amountToTake);
    }
  }

    abstract protected double getDepositCommission(double amountCommission);

    abstract protected double getWithdrawalCommission(double amountCommission);


}