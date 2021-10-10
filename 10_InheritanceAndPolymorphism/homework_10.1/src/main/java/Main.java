public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    BankAccount depositAccount = new DepositAccount();
    BankAccount cart = new CardAccount();
    cart.put(100);
    System.out.println("До перевода " + "\n" + "Cart Account " + cart.getAmount() + "\n" + "Deposit Account " + depositAccount.getAmount());
    if (cart.send(cart, 20)) {
      depositAccount.put(20);
    }
    System.out.println("После перевода " + "\n" + "Cart Account " + cart.getAmount() + "\n" + "Deposit Account " + depositAccount.getAmount() + "\n");
    depositAccount.put(200);
    System.out.println("До перевода " + "\n" + "Deposit Account " + depositAccount.getAmount() + "\n" + "Bank Account " + bankAccount.getAmount());
    if (depositAccount.send(depositAccount, 80)) {
      bankAccount.put(80);
    }
    System.out.println("После перевода " + "\n" + "Deposit Account " + depositAccount.getAmount() + "\n" + "Bank Account " + bankAccount.getAmount() + "\n");
  }
}
