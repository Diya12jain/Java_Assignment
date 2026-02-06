package Assignment_Bit;

import java.util.Scanner;

public class Max_without_comp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int diff = a - b;
        int sign = (diff >> 31) & 1;
        int max = a - sign * diff;
        System.out.println("Maximum number is : " + max);
        sc.close();
    }
}
