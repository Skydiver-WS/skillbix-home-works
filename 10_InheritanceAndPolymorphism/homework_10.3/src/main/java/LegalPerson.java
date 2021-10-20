public class LegalPerson extends PhysicalPerson {


    @Override
    public void put(double amountToPut) {
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        setWithdrawalCommission(PERCENT_TAKE);
        super.take(amountToTake * getCommission());
    }
}