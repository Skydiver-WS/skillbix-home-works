public class LegalPerson extends PhysicalPerson {
  private final double PERCENT_TAKE = 1.01;

  @Override
  public void put(double amountToPut) {
    super.put(amountToPut);
  }

  @Override
  public void take(double amountToTake) {
    super.take(amountToTake * PERCENT_TAKE);
  }
}
