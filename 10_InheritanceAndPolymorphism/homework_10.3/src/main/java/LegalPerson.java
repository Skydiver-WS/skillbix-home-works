public class LegalPerson extends PhysicalPerson {
    private final double PERCENT_TAKE = 0.01;

    @Override
    public double getWithdrawalCommission(double amountCommission) {
        return amountCommission * PERCENT_TAKE;
    }
}