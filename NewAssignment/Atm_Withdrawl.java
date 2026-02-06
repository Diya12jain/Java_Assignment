package NewAssignment;

import java.util.Scanner;

public class Atm_Withdrawl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter awithdrawl amount: ");
        double with_amount = sc.nextDouble();
        double amount = 0;
        if (with_amount % 100 == 0) {
            amount = balance - with_amount;
        }
        if (amount >= 1000) {
            System.out.println("Withdrawl Successed");
        } else {
            System.out.println("Withdrawl Failed");
        }
        sc.close();
    }
}
