package LAp5;

import java.util.*;

/**
 *
 * @author Student
 */
public class Lab5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ManagementStudent m1 = new ManagementStudent();
        
        String s = "C:\\lep5\\student.Dat";
        String s1 = "C:\\lep5\\result.Dat";
        m1.ReadFile(s);
        m1.OutputList();
        System.out.println("1. Add a new college student.");
        System.out.println("2. Add a new university student.");
        System.out.println("3. Remove a student from the list with the student code entered from the keyboard");
        System.out.println("4. Print student list.");
        System.out.println("""
                           5. Print the list of students eligible for graduation and indicate the number of eligible
                           students.""");
        System.out.println("6. Sort the student list ascending by Student type (College, university) and student code");
        System.out.println("7. Find student list by student's full name (Contains).");
        System.out.println("8. Exit");
        int n;
        do {
            System.out.println("\nInput Number: ");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    m1.AddCollegeStudent();
                    m1.WriteFile(s);
                    break;
                }
                case 2 -> {
                    m1.AddUniversityStudent();
                    m1.WriteFile(s);
                    break;
                }
                case 3 -> {
                    m1.RemoveStudentbyNumberCode();
                    m1.WriteFile(s);
                    break;
                }
                case 4 ->
                    m1.OutputList();
                case 5 ->
                    m1.PrintIfCheck();
                case 6 -> {
                    m1.Sapxep();
                    m1.WriteFile(s);
                    break;
                }
                case 7 -> {
                    m1.ReadFile(s1);
                    m1.Find();
                    m1.WriteFile(s1);
                }
            }
        } while (n != 8);
    }
}
