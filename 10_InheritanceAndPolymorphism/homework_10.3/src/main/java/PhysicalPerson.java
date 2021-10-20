public class PhysicalPerson extends Client {
    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake > 0 && amount > amountToTake) {
            amount -= amountToTake;
        }
    }

    @Override
    public void setWithdrawalCommission(double amountCommission) {
        commission = amountCommission;
    }

    @Override
    public void setDepositCommission(double amountCommission) {
        if (amountCommission >= COMMISSION_POINT) {
            commission = amountCommission * PERCENT_PUT_MORE_1000;
        } else {
            commission = amountCommission * PERCENT_PUT_LESS_1000;
        }
    }
}