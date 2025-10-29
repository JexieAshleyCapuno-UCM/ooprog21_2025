import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        double balance = scanner.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};

        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            double newBalance = balance;

            System.out.printf("%nWith an initial balance of $%.1f at an interest rate of %.2f%n", balance, rate);

            for (int year = 1; year <= 4; year++) {
                newBalance += newBalance * rate;

                if (newBalance % 1 == 0)
                    System.out.printf("After year %d balance is %.1f%n", year, newBalance);
                else
                    System.out.printf("After year %d balance is %s%n", year, newBalance);
            }
        }
    }
}
