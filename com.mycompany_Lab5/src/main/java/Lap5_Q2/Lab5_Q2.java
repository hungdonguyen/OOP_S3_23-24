
package Lap5_Q2;

import java.util.Scanner;

/**
 *
 * @author Maytinh
 */
public class Lab5_Q2 {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String args[]) {
        StaffManagement sm1 = new StaffManagement();
        String s = "C:\\Users\\Administrator\\Downloads\\lep5_q2\\EiuStaff.eiu";
        sm1.ReadFile(s);
        System.out.println("1.Input Staff.");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> {
                sm1.InputStaffList();
                sm1.WriteFile(s);
                break;
            }
        }
        
        
    }
}
