public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        BankAccount depositAccount = new DepositAccount();
        BankAccount cart = new CardAccount();
        cart.put(100);        System.out.println("До перевода " + "\n" + "Cart Account " + cart.getAmount() + "\n" + "Deposit Account " + depositAccount.getAmount() + "\n");
        if (cart.send(depositAccount, 95)) {
            System.out.println("Перевод выполнен успешно");
            System.out.println("После перевода " + "\n" + "Cart Account " + cart.getAmount() + "\n" + "Deposit Account " + depositAccount.getAmount() + "\n");
        } else {
            System.out.println("Перевод не выполнен" + "\n");
        }
        depositAccount.put(200);
        System.out.println("До перевода " + "\n" + "Deposit Account " + depositAccount.getAmount() + "\n" + "Bank Account " + bankAccount.getAmount());
        if (depositAccount.send(bankAccount, 80)) {
            System.out.println("Перевод выполнен успешно" + "\n");
            System.out.println("После перевода " + "\n" + "Deposit Account " + depositAccount.getAmount() + "\n" + "Bank Account " + bankAccount.getAmount() + "\n");
        } else {
            System.out.println("Перевод не выполнен" + "\n");
        }
    }
}
