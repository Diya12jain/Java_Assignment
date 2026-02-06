package NewAssignment;

import java.util.Scanner;

public class Emp_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary of the employee: ");
        int basic_sal = sc.nextInt();
        double hra = 0;
        double da = 0;
        if (basic_sal >= 30000) {
            hra = basic_sal * 0.2;
            da = basic_sal * 0.15;
        } else {
            hra = basic_sal * 0.1;
            da = basic_sal * 0.08;
        }
        double pf = basic_sal * 0.12;
        double net_sal = basic_sal + hra + da - pf;
        System.out.print("The net salary of the employee is: ");
        System.out.printf("%.2f", net_sal);
        sc.close();
    }
}
