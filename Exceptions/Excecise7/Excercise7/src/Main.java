public class Main {
    public static void main(String[] args){
        try {
            BankAccount account = new BankAccount("John Doe", 10_000);
            System.out.println(account);
            account.deposit(500);
            System.out.println(account);
            account.withdraw(300);
            System.out.println(account);
            account.withdraw(15_000);
        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
