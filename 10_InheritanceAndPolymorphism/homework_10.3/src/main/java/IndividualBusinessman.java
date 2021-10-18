public class IndividualBusinessman extends PhysicalPerson {
  private final double PERCENT_PUT_MORE_1000 = 0.005;
  private final double PERCENT_PUT_LESS_1000 = 0.01;
  private final double COMMISSION_POINT = 1000;

  @Override
  public void take(double amountToTake) {
    super.take(amountToTake);
  }

  @Override
  public void put(double amountToPut) {
    double commission = 0;
    if (amountToPut >= COMMISSION_POINT) {
      commission = amountToPut * PERCENT_PUT_MORE_1000;
    } else {
      commission = amountToPut * PERCENT_PUT_LESS_1000;
    }
    super.put(amountToPut - commission);
  }
}
