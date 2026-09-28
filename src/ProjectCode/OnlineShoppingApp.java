package ProjectCode;

import java.util.Scanner;

public class OnlineShoppingApp {

    // Function to calculate final amount based on payment mode and display billing details
    public static void Bill(String name, String prodName, String prodCode, double amount, String address, char paymentMode) {
        double discountOrFee = 0;
        double finalAmount = amount;
        String modeText = "";

        // Process payment modes and apply practical adjustments (e.g., card discounts or COD processing fees)
        switch (Character.toUpperCase(paymentMode)) {
            case 'C':
                modeText = "Credit Card (5% Discount Applied)";
                discountOrFee = amount * 0.05;
                finalAmount = amount - discountOrFee;
                break;
            case 'D':
                modeText = "Debit Card (2% Discount Applied)";
                discountOrFee = amount * 0.02;
                finalAmount = amount - discountOrFee;
                break;
            case 'N':
                modeText = "Net Banking";
                finalAmount = amount;
                break;
            case 'P':
                modeText = "Pay on Delivery (COD Fee of ₹50 Applied)";
                discountOrFee = 50.0;
                finalAmount = amount + discountOrFee;
                break;
            default:
                modeText = "Unknown / Standard Processing";
                finalAmount = amount;
                break;
        }

        // Display customer billing summary
        System.out.println("\n===============================================");
        System.out.println("               INVOICE / BILL DETAILS          ");
        System.out.println("===============================================");
        System.out.println("Customer Name    : " + name);
        System.out.println("Shipping Address : " + address);
        System.out.println("Product Name     : " + prodName);
        System.out.println("Product Code     : " + prodCode);
        System.out.println("Base Amount      : ₹" + String.format("%.2f", amount));
        System.out.println("Payment Method   : " + modeText);

        if (Character.toUpperCase(paymentMode) == 'C' || Character.toUpperCase(paymentMode) == 'D') {
            System.out.println("Discount Allowed : -₹" + String.format("%.2f", discountOrFee));
        } else if (Character.toUpperCase(paymentMode) == 'P') {
            System.out.println("COD Surcharge    : +₹" + String.format("%.2f", discountOrFee));
        }

        System.out.println("-----------------------------------------------");
        System.out.println("TOTAL AMOUNT PAID: ₹" + String.format("%.2f", finalAmount));
        System.out.println("===============================================\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueShopping = true;
        int customerCount = 0;

        System.out.println("--- WELCOME TO THE ONLINE SHOPPING BILLING SYSTEM ---");

        while (continueShopping) {
            customerCount++;
            System.out.println("\n--- Processing Customer #" + customerCount + " ---");

            // (i) Inputs: Customer details
            System.out.print("Enter Customer's Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Product Name: ");
            String prodName = sc.nextLine();

            System.out.print("Enter Product Code: ");
            String prodCode = sc.nextLine();

            System.out.print("Enter Amount to be Paid: ");
            double amount = Double.parseDouble(sc.nextLine());

            System.out.print("Enter Shipping Address: ");
            String address = sc.nextLine();

            // (ii) Inputs: Way / Mode of Payment
            System.out.println("Select Mode of Payment:");
            System.out.println("  [C] - Credit Card");
            System.out.println("  [D] - Debit Card");
            System.out.println("  [N] - Net Banking");
            System.out.println("  [P] - Pay on Delivery");
            System.out.print("Enter your choice: ");
            char paymentMode = sc.nextLine().charAt(0);

            // Invoke the billing function to compute and show details
            Bill(name, prodName, prodCode, amount, address, paymentMode);

            // (iii) Continuation Check
            System.out.print("Do you want to continue shopping for another customer? (Yes/No): ");
            String choice = sc.nextLine().trim();

            if (choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("N")) {
                continueShopping = false;
            }
        }

        System.out.println("\nThank you for using the Shopping App! Total customers processed: " + customerCount);
        sc.close();
    }
}
