package NewAssignment;

import java.util.Scanner;

public class Pattern_Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range you want to print the pattern of the numbers:");
        int range = sc.nextInt();
        System.out.println("The pattern is:");
        for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
