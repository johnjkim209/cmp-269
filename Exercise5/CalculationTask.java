public class CalculationTask {
    static int result = 0;

    public void heavyCalculation() {  // calculation so heavy it overflows lmao
        for (int i=0; i<1_000_000_000; i++) {
            result += i;
        }
    }

    public void display() {
        System.out.println("Calculation finished: " + result);
    }

    public static void main(String[] args) {
        CalculationTask CT = new CalculationTask();
        Thread calculation = new Thread(() -> {
            CT.heavyCalculation();
        });
        try {
            calculation.start();
            calculation.join();
            CT.display();
        } catch (Exception e) {
            System.out.println("Thread was interrupted. ");
            System.out.println(e.getMessage());
            Thread.currentThread().interrupt();
        }
    }
}
