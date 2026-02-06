package Assignment_Bit;

import java.util.Scanner;

public class Subt_Without_op {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int b_complement = ~b + 1;
        int result = a;
        int carry = b_complement;
        while (carry != 0) {
            int temp = result ^ carry;
            carry = (result & carry) << 1;
            result = temp;
        }
        System.out.print("The subtraction of " + a + " and " + b + " is : ");
        System.out.println(result);

        sc.close();
    }
}
