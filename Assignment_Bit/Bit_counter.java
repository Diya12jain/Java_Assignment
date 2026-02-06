package Assignment_Bit;

import java.util.Scanner;

public class Bit_counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its digit : ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >> 1;
        }
        System.out.println("Set bits count in the number : " + count);
        sc.close();
    }
}
