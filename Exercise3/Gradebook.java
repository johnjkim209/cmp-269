import java.util.Scanner;

class Gradebook {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Divide 10 by: ");
            int divisor = scanner.nextInt();
            int result = 10 / divisor;
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 not allowed. Try again.");
        } finally {
            scanner.close();
        }

        System.out.println("Congrats u did it");
        System.out.println("end of program");
    }
}
