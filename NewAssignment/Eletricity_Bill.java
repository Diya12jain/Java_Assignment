package NewAssignment;

import java.util.Scanner;

public class Eletricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the units consumed:");
        double units = sc.nextDouble();
        if (units <= 100 && units > 0) {
            units *= 2;
        } else if (units <= 200 && units > 100) {
            units *= 3;
        } else {
            units = ((units - 200) * 5) + 500;
        }
        int meter_charge = 150;
        System.out.print("The electricity bill is: ");
        System.out.println(units + meter_charge);
        sc.close();
    }
}
