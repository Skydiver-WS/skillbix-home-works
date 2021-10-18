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
}
