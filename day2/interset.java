import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter rate of interest (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();

        if (principal <= 0) {
            System.out.println("Principal amount must be positive.");
        } else if (rate <= 0) {
            System.out.println("Rate of interest must be positive.");
        } else if (time <= 0) {
            System.out.println("Time must be positive.");
        } else {
            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("Simple Interest = " + simpleInterest);
        }

        scanner.close();
    }
}
