import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Gradebook {
    public static void main(String args[]) {
        String file_input = "students.txt";
        String file_output = "grades_report.txt";
        File file = new File(file_input);
        try (Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }

        /*
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (!line.equals("")) {
            System.out.println(line);
        }


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
         */
    }
}
