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
        String s = "C:\\JAVAVA\\EiuStaff.eiu";
        String s1 = "C:\\JAVAVA\\TotalSalary.eiu";
        String s2 = "C:\\JAVAVA\\TotalSalarybyType.eiu";
        String s3 = "C:\\JAVAVA\\HighestPaidStaff.eiu";
        sm1.ReadFile(s);
        System.out.println("\nChoose section: ");
        System.out.println("1.Input List Staff");
        System.out.println("2.Output List Staff");
        System.out.println("3.Find And Edit by ID");
        System.out.println("4.Remove by Id");
        System.out.println("5.Print total salary");
        System.out.println("6.Print total salary by type");
        System.out.println("7.List 3 Highest Staff Salary ");
        System.out.println("8.Exit");
        System.out.println("Input Number: ");
        int n = sc.nextInt();
        double totalSalary = 0;

        do {
            File f = new File("C:\\JAVAVA\\TotalSalary.eiu");
            File f1 = new File("C:\\JAVAVA\\TotalSalarybyType.eiu");
            File f2 = new File("C:\\JAVAVA\\HighestPaidStaff.eiu");

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
                    f.delete();
                    sm1.ReadFile(s1);
                    totalSalary=sm1.TotalSalary();
                    System.out.println("Total Salary: " + totalSalary);
                    break;
                }
                case 6 -> {
                    f1.delete();
                    sm1.ReadFile(s2);
                    sm1.TotalSalarybyType();
                }
                case 7 -> {
                    f2.delete();
                    sm1.ReadFile(s3);
                    sm1.PrintHighestSalaryStaff();
                }
            }
            System.out.println("\nChoose section:");
            System.out.println("1.Input List Staff");
            System.out.println("2.Output List Staff");
            System.out.println("3.Find And Edit by ID");
            System.out.println("4.Remove by Id");
            System.out.println("5.Print total salary");
            System.out.println("6.Print total salary by type");
            System.out.println("7.List 3 Highest Staff Salary ");
            System.out.println("8.Exit");
            System.out.println("Input Number: ");
            n = sc.nextInt();
        } while (n != 8);
        sm1.WriteFile(s1); 
        sm1.WriteFile(s2);
        sm1.WriteFile(s3);

    }
}
