package Assignment_Bit;

import java.util.Scanner;

public class Modulo_without_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int dividend = sc.nextInt();
        System.out.print("Enter second number : ");
        int divisor = sc.nextInt();
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed");
        }
        boolean negative = false;
        if (dividend < 0) {
            dividend = ~dividend + 1;
            negative = true;
        }
        if (divisor < 0) {
            divisor = ~divisor + 1;
        }
        while (dividend >= divisor) {
            int temp = divisor;

            while ((temp << 1) <= dividend) {
                temp = temp << 1;
            }
            dividend = dividend - temp;
        }
        if (negative) {
            dividend = ~dividend + 1;
        }
        System.out.println("Modulo (Remainder) is : " + dividend);
        sc.close();
    }
}
