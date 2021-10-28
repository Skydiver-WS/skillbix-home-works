public abstract class Client {
    protected double amount;

    public double getAmount() {
        return amount;
    }

    abstract public void put(double amountToPut);

    abstract public void take(double amountToTake);

    abstract protected double getDepositCommission(double amountCommission);

    abstract protected double getWithdrawalCommission(double amountCommission);


}