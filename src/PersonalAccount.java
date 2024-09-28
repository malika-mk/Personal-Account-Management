import com.sun.jdi.Value;
 /**
 * The PersonalAccount class represents a bank account with basic functionalities
 * such as deposit, withdrawal, and transaction history tracking.
 */
import java.util.ArrayList;

public class PersonalAccount {
    // Account attributes
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    /**
     * Constructs a PersonalAccount with the specified account number,
     * account holder name, and initial balance.
     */
    public PersonalAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactions = new ArrayList<Amount>();

    }
    /**
     * Returns the account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }
    /**
     * Returns the account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }
    /**
     * Returns the current balance of the account.
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Returns the list of transactions performed on the account.
     */
    public ArrayList<Amount> getTransactions() {
        return transactions;
    }
    /**
     * Deposits a positive amount into the account and records the transaction.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, TransactionType.DEPOSIT));
        }
    }
    /**
     * Withdraws a specified amount from the account if the balance is sufficient.
     * Records the transaction as a withdrawal.
     */
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Amount(amount, TransactionType.WITHDRAWAL));
        }
    }
    /**
     * Prints the transaction history for the account.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }


}


