public class LegalPerson extends Client {
    private final double PERCENT_TAKE = 0.01;

    @Override
    protected double getWithdrawalCommission(double amountCommission) {
        return amountCommission * PERCENT_TAKE;
    }

    @Override
    protected double getDepositCommission(double amountCommission) {
        return 0;
    }
}