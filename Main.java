package bank;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BOB");

        Account account = new Account("60206" , "Dhanush");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            try {
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Please enter the amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                        break;

                    case 2:
                        System.out.print("Please enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                        break;

                    case 3:
                        account.showBalance();
                        break;

                    case 4:
                        System.out.println("Thank you for being our patner in banking!");
                        sc.close();
                        return;

                    default:
                        System.out.println("Incorrect choice. Please select between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numerical values only.");
                sc.nextLine(); 
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

