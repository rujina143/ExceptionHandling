public class BankAccount {
    private String accountBalance;
    private double balance;

    public BankAccount(String accountBalance) {
        this.balance = 0.0;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountBalance, double balance) {
        this.accountBalance = accountBalance;
        this.balance = balance;
    }



    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount is invalid");
        }
        balance = balance + amount;
        System.out.println("Deposited:" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0 || amount > balance) {
            throw new InsufficientFundsException("Fund is insufficient!");
        }
        balance = balance - amount;
        System.out.println("Withdraw:" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountBalance() {
        return accountBalance;
    }
}







