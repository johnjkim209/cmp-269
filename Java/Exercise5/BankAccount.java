public class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if(balance > amount) {
            System.out.println("Sufficient funds.");
            balance -= amount;
            System.out.println("Your new balance is " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void display()  { System.out.println("The balance is $" + balance); }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread husband = new Thread(() -> {
            account.withdraw(700);
        });
        Thread wife = new Thread(() -> {
            account.withdraw(700);
        });
        try {
            husband.start();
            wife.start();
            husband.join();
            wife.join();
            account.display();

        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted. ");
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }

        
    }

}
