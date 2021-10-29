public class PhysicalPerson extends Client {

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
    }

    @Override
    protected double getWithdrawalCommission(double amountCommission) {
        return 0;
    }

    @Override
    protected double getDepositCommission(double amountCommission) {
        return 0;
    }

}