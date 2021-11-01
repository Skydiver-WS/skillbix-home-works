public class PhysicalPerson extends Client {

    @Override
    protected double getWithdrawalCommission(double amountCommission) {
        return 0;
    }

    @Override
    protected double getDepositCommission(double amountCommission) {
        return 0;
    }

}