public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount();
    BankAccount depositAccount = new DepositAccount();
    BankAccount cart = new CardAccount();
    cart.put(100);
    System.out.println("До перевода " + "\n" + "Cart Account " + cart.getAmount() + "\n" + "Deposit Account " + depositAccount.getAmount());
    if (cart.send(cart,99)){
      depositAccount.put(99);
    }
    System.out.println("После перевода " + "\n" + "Cart Account " + cart.getAmount() + "\n" + "Deposit Account " + depositAccount.getAmount() + "\n");
  }
}
