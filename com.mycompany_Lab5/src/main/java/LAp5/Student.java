
package LAp5;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public abstract class Student implements Serializable{

    static Scanner sc = new Scanner(System.in);

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public int getTotalcredit() {
        return totalcredit;
    }

    public void setTotalcredit(int totalcredit) {
        this.totalcredit = totalcredit;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Student(String studentNumber, String studentFullName, int totalcredit, double average) {
        this.studentNumber = studentNumber;
        this.studentFullName = studentFullName;
        this.totalcredit = totalcredit;
        this.average = average;
    }

    public Student() {
    }
    private String studentNumber;
    private String studentFullName;
    private int totalcredit;
    private double average;

    public void Input() {
        System.out.print("\nInput studentNumber: ");
        studentNumber = sc.next();
        System.out.print("Input studentFullName: ");
        studentFullName = sc.next();
        System.out.print("Input totalcredit: ");
        totalcredit = sc.nextInt();
        System.out.print("Input average: ");
        average = sc.nextDouble();
    }

    public void Output() {
        System.out.print("\nstudentNumber: " + studentNumber + "\nstudentFullName: " + studentFullName + "\ntotalcredit: " + totalcredit + "\naverage: " + average );
    }

    public abstract boolean CheckGraduation();

    public abstract String GetType();

}
