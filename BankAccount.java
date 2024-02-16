public class BankAccount {
    private float balance;
    private Person owner;

    public void withdraw(float amount) {
        balance -= amount;
        //TODO: Add logic to transfer money to owner
    }

    public void deposit(float amount) {
        //TODO: Add logic to take money from owner
        balance += amount;
    }

    public void BankAccount(Person owner) {

    }
}