package Assignment_Bit;

import java.util.Scanner;

public class Multi_without_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int result = 0;
        boolean negative = false;
        if (a < 0) {
            a = ~a + 1;
            negative = !negative;
        }
        if (b < 0) {
            b = ~b + 1;
            negative = !negative;
        }
        while (b != 0) {
            if ((b & 1) == 1) {
                int x = result;
                int y = a;
                while (y != 0) {
                    int carry = x & y;
                    x = x ^ y;
                    y = carry << 1;
                }
                result = x;
            }
            a = a << 1;
            b = b >> 1;
        }
        if (negative) {
            result = ~result + 1;
        }
        System.out.println("Multiplication result is : " + result);
        sc.close();

    }
}
