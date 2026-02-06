package NewAssignment;

import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of item: ");
        int item_price = sc.nextInt();
        System.out.print("Enter the quantity of item: ");
        int quantity = sc.nextInt();
        int total = item_price * quantity;
        double after_disc = 0;
        if (total >= 2000 && total <= 5000) {
            after_disc = total - (total * 0.05);
        } else if (total >= 5000) {
            after_disc = total - (total * 0.1);
        } else if (total < 2000) {
            after_disc = total;
        }
        double gst = after_disc * 0.18;
        double actual_bill = after_disc + gst;
        System.out.print("The actual bill of the item is: ");
        System.out.printf("%.2f", actual_bill);
        sc.close();
    }
}
