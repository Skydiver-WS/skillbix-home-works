public class IndividualBusinessman extends PhysicalPerson {
    private final double PERCENT_PUT_MORE_1000 = 0.005;
    private final double PERCENT_PUT_LESS_1000 = 0.01;
    private final double COMMISSION_POINT = 1000;

    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
    }

    @Override
    protected double getDepositCommission(double amountCommission) {
        if (amountCommission >= COMMISSION_POINT) {
            amountCommission = amountCommission * PERCENT_PUT_MORE_1000;
        } else {
            amountCommission = amountCommission * PERCENT_PUT_LESS_1000;
        }
        return amountCommission;
    }
}