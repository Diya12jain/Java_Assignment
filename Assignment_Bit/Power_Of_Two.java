package Assignment_Bit;

import java.util.Scanner;

public class Power_Of_Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check it is in power of two or not : ");
        int n = sc.nextInt();
        boolean result = (n > 0) && ((n & (n - 1)) == 0);
        System.out.println(result);
        sc.close();
    }
}
