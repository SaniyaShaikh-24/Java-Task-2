import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Fixed conversion rate for USD to INR
        double conversionRate = 73.5;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in USD: ");
        double usdAmount = scanner.nextDouble();

        // Convert USD to INR
        double inrAmount = usdAmount * conversionRate;

        System.out.println("Converted amount in INR: " + inrAmount);
    }
}
