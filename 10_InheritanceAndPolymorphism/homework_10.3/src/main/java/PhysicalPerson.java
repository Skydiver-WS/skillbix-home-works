public class PhysicalPerson extends Client {
    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut - getDepositCommission(amountToPut);
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake > 0 && amount > amountToTake) {
            amount -= amountToTake + getWithdrawalCommission(amountToTake);
        }
    }

    @Override
    public double getWithdrawalCommission(double amountCommission) {
        return 0;
    }

    @Override
    public double getDepositCommission(double amountCommission) {
        return 0;
    }

}