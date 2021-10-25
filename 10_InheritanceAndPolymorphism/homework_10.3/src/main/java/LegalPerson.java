public class LegalPerson extends PhysicalPerson {
    private final double PERCENT_TAKE = 0.01;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake - getWithdrawalCommission(amountToTake));
    }

    @Override
    public double getWithdrawalCommission(double amountCommission) {
        return amountCommission * PERCENT_TAKE;
    }
}