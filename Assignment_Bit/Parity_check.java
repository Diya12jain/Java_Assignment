package Assignment_Bit;

import java.util.Scanner;

public class Parity_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check its parity : ");
        int n = sc.nextInt();
        if ((n & 1) == 0)
            System.out.println("Given number is Even");
        else
            System.out.println("Given number is Odd");
        sc.close();
    }
}
