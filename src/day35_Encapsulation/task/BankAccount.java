package day35_Encapsulation.task;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double number){
        if (number <= 0){
            System.err.println("You cannot enter zero or negative number");
            System.exit(0);
        }

        balance += number;
    }

    public void withdraw(double number){
        if (number <= 0){
            System.err.println("You cannot enter zero or negative number");
            System.exit(0);
        }

        if (number > balance){
            System.err.println("You cannot enter bigger than balance");
            System.exit(0);
        }

        balance -= number;
    }

    public void checkBalance(){
        System.out.println("Your balance is : $" + balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=$" + balance +
                '}';
    }
}
/*
create a class named BankAccount
    Private variables:
        accountHolder, accountNumber, balance

    encapsulate all the fields
    Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)

    Extra methods:
        deposit()
        withdraw()
        checkBalance()
        toString()
        DO NOT duplicate any code fragments
 */