package Lap5_Q2;

import java.io.File;
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
        File f = new File("C:\\Users\\Administrator\\Downloads\\lep5_q2\\TotalSalary.eiu");
        f.delete();
        String s = "C:\\Users\\Administrator\\Downloads\\lep5_q2\\EiuStaff.eiu";
        String s1 = "C:\\Users\\Administrator\\Downloads\\lep5_q2\\TotalSalary.eiu";
        sm1.ReadFile(s);
        System.out.println("\nChoose section: ");
        System.out.println("1.Input List Staff");
        System.out.println("2.Output List Staff");
        System.out.println("3.Find And Edit by ID");
        System.out.println("4.Remove by Id");
        System.out.println("5.Print total salary");
        System.out.println("7.Exit");
        System.out.println("Input Number: ");
        int n = sc.nextInt();
        double totalSalary = sm1.TotalSalary(); 

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
                case 5 -> {
                    f = new File("C:\\Users\\Administrator\\Downloads\\lep5_q2\\TotalSalary.eiu");
                    f.deleteOnExit();
                    sm1.ReadFile(s1);
                   
                    System.out.println("Total Salary: " + totalSalary);
                    sm1.WriteFile(s1); 
                    break;
                }
            }
            System.out.println("\nChoose section:");
            System.out.println("1.Input List Staff");
            System.out.println("2.Output List Staff");
            System.out.println("3.Find And Edit by ID");
            System.out.println("4.Remove by Id");
            System.out.println("5.Print total salary");
            System.out.println("7.Exit");
            System.out.println("Input Number: ");
            n = sc.nextInt();
        } while (n != 7);

    }
}
