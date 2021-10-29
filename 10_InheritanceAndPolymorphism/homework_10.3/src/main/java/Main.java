public class Main {
  public static void main(String[] args) {
    Client client = new PhysicalPerson();
    Client legalPerson = new LegalPerson();
    Client individualBusinessman = new IndividualBusinessman();
    client.put(100.0);
    legalPerson.put(100.0);
    individualBusinessman.put(500.0);
    System.out.println("Клиент " + client.getAmount() + "\n" + "Частное лицо " + legalPerson.getAmount() + "\n" + "ИП " + individualBusinessman.getAmount() + "\n");
    client.take(50);
    legalPerson.take(50);
    individualBusinessman.take(51);
    System.out.println("Клиент " + client.getAmount() + "\n" + "Частное лицо " + legalPerson.getAmount() + "\n" + "ИП " + individualBusinessman.getAmount());
  }
}