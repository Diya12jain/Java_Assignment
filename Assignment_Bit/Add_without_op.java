package Assignment_Bit;

import java.util.Scanner;

public class Add_without_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        System.out.print("The sum of " + a + " and " + b + " is : ");
        System.out.println(a);

        sc.close();
    }
}
