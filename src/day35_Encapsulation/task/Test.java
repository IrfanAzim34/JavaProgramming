package day35_Encapsulation.task;

public class Test {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Irfan Azim",12345,0);
        bankAccount.deposit(100);
        bankAccount.withdraw(100);
        bankAccount.deposit(1000);
        bankAccount.checkBalance();


        System.out.println(bankAccount);

    }

}
