class BankAccount {
    private int balance = 1200;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of: " + amount);
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        
    BankAccount account = new BankAccount();
    Runnable task = () -> account.withdraw(600);
    Thread t1 = new Thread(task , "Amandeep");
    Thread t2 = new Thread(task , "Arun");
    t1.start();
    t2.start();

    
}
}