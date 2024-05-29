package Lap5_Q2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Maytinh
 */
public class Lab5_Q2 implements Serializable {

    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        StaffManagement sm1 = new StaffManagement();
        String s = "C:\\Users\\Administrator\\Downloads\\lep5_q2\\EiuStaff.eiu";
        sm1.ReadFile(s);
        System.out.println("\nChoose section: ");
        System.out.println("1.Input List Staff");
        System.out.println("2.Output List Staff");
        System.out.println("3.Find And Edit by ID");
        System.out.println("4.Remove by Id");
        System.out.println("7.Exit");
        System.out.println("Input Number: ");
        int n = sc.nextInt();
        do {
            switch (n) {
                case 1 -> {
                    sm1.InputStaffList();
                    sm1.WriteFile(s);
                    break;
                }
                case 2 -> {
                    sm1.OutputListStaff();
                    break;
                }
                case 3 -> {
                    sm1.FindAndEditById();
                    sm1.WriteFile(s);
                    break;
                }
                case 4 -> {
                    sm1.RemoveId();
                    sm1.WriteFile(s);
                    break;
                }
            }
            System.out.println("\nChoose section:");
            System.out.println("1.Input List Staff");
            System.out.println("2.Output List Staff");
            System.out.println("3.Find And Edit by ID");
            System.out.println("4.Remove by Id");
            System.out.println("7.Exit");
            System.out.println("Input Number: ");

            n = sc.nextInt();
        } while (n != 7);

    }
}
