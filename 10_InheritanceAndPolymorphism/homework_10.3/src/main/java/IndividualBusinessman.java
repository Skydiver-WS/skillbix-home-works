public class IndividualBusinessman extends PhysicalPerson {

    @Override
    public void take(double amountToTake) {
        super.take(amountToTake);
    }

    @Override
    public void put(double amountToPut) {
        setDepositCommission(amountToPut);
        super.put(amountToPut - getCommission());
    }
}