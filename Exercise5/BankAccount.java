public class BankAccount {
    private int balance = 1000;

    public void withdraw(int amount) {
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
        husband.start();
        wife.start();
        account.display();
    }

}
