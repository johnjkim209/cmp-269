public class GreeterTask implements Runnable {
    @Override
    public void run() {
        try {
            for(int i=0;i<5;i++) {
                System.out.println("Hello from " + Thread.currentThread().getName());
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted. ");
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();  // restore interrupt state?
        }
        
    }

    public static void main(String[] args) {
        GreeterTask greeterTask = new GreeterTask();

        Thread thread1 = new Thread(greeterTask);
        Thread thread2 = new Thread(greeterTask);

        thread1.start();
        thread2.start();
    }
}
