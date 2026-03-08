public class VisualizerTask implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("I'm sleeping");
            Thread.sleep(2000);
            System.out.println("I'm awake");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted. ");
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }
        
    }
    public static void main(String[] args) {
        VisualizerTask visualizerTask = new VisualizerTask();
        Thread sleepyThread = new Thread(visualizerTask);
        System.out.println(sleepyThread.getState());
        sleepyThread.start();
        System.out.println(sleepyThread.getState());
        try {
            Thread.sleep(500);
            System.out.println(sleepyThread.getState());  // sleeping
            Thread.sleep(2000);
            System.out.println(sleepyThread.getState());  // finished
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted. ");
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }
        
        
    }
}
