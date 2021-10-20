public abstract class Client {
    protected double amount;
    protected double commission;
    protected final double PERCENT_TAKE = 1.01;
    protected final double PERCENT_PUT_MORE_1000 = 0.005;
    protected final double PERCENT_PUT_LESS_1000 = 0.01;
    protected final double COMMISSION_POINT = 1000;

    public double getAmount() {
        return amount;
    }

    public double getCommission(){
        return commission;
    }

    abstract public void put(double amountToPut);

    abstract public void take(double amountToTake);

    abstract public void setDepositCommission(double amountCommission);

    abstract public void setWithdrawalCommission(double amountCommission);

}