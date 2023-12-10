package Examples;

public class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;
    public Account(String accountNumber, String ownerName, double balance) {
        validateAccountNumber(accountNumber);
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(Account receiver, double amount) {
        validateTransfer(amount);

        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds for transfer");
        }

        this.balance -= amount;
        receiver.balance += amount;
    }

    private void validateAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.length() != 26) {
            throw new IllegalArgumentException("Invalid account number");
        }
    }

    private void validateTransfer(double amount) {
        if (amount <= 0 || amount > balance) {
            throw new IllegalArgumentException("Invalid transfer amount");
        }
    }
}
