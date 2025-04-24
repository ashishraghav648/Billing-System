import java.util.Scanner;

public class billingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Simple Billing System ===");
        System.out.print("Enter number of items: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] itemNames = new String[n];
        int[] quantities = new int[n];
        double[] prices = new double[n];
        double[] totals = new double[n];
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nItem " + (i + 1));
            System.out.print("Enter item name: ");
            itemNames[i] = scanner.nextLine();

            System.out.print("Enter quantity: ");
            quantities[i] = scanner.nextInt();

            System.out.print("Enter price per item: ₹");
            prices[i] = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            totals[i] = quantities[i] * prices[i];
            grandTotal += totals[i];
        }

        // Print Bill
        System.out.println("\n========== Bill ==========");
        System.out.printf("%-20s%-10s%-10s%-10s\n", "Item", "Qty", "Price", "Total");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s%-10d%-10.2f%-10.2f\n", itemNames[i], quantities[i], prices[i], totals[i]);
        }
        System.out.println("-------------------------------");
        System.out.printf("Grand Total: ₹%.2f\n", grandTotal);
        System.out.println("Thank you for shopping with us!");

        scanner.close();
    }
}
