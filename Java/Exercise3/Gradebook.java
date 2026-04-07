import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class Gradebook {
    public static void main(String args[]) {
        String file_input = "students.txt";
        String file_output = "grades_report.txt";
        File file = new File(file_input);
        try (Scanner scanner = new Scanner(file)) {
            PrintWriter writer = new PrintWriter(new File(file_output));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
                try {
                    String[] str_grades = line.split(" ");
                    int divisor = 0;
                    double sum = 0.0d;
                    for (int i=1;i<str_grades.length;i++) {
                        sum += Double.parseDouble(str_grades[i]);
                        divisor += 1;
                    }
                    double result = sum / divisor;
                    System.out.printf("Average: %.2f%n", result);
                    writer.println(String.format("Student: %s | Average: %.2f", str_grades[0], result));
                } catch (NumberFormatException e) {
                    System.out.println("Non-number in " + file_input + ", please sanitize data");
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
    }
}
