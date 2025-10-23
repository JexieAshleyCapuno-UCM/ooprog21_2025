import java.util.Scanner;
 class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 100.00;  
        double rate = 0.03;       
        int year = 1;
        int choice;

        do {
            balance = balance + (balance * rate);
            System.out.printf("After year %d at %.2f  interest rate, balance is $%.4f\n", year, rate, balance);

            System.out.println();
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.println("Enter 1 for yes");
            System.out.print("    or any other number for no >> ");
            choice = input.nextInt();
            year++;

        } while (choice == 1);
    }
}
