package Lap5_Q2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maytinh
 */
public class Specialists extends Staffmembers implements Serializable {

    public int getNumberOfEducationProjectInvolved() {
        return numberOfEducationProjectInvolved;
    }

    public void setNumberOfEducationProjectInvolved(int numberOfEducationProjectInvolved) {
        this.numberOfEducationProjectInvolved = numberOfEducationProjectInvolved;
    }

    public int getNumberOfYearsOfWorkExperience() {
        return numberOfYearsOfWorkExperience;
    }

    public void setNumberOfYearsOfWorkExperience(int numberOfYearsOfWorkExperience) {
        this.numberOfYearsOfWorkExperience = numberOfYearsOfWorkExperience;
    }

    public ArrayList<String> getEducationCode() {
        return EducationCode;
    }

    public void setEducationCode(ArrayList<String> EducationCode) {
        this.EducationCode = EducationCode;
    }

    public Specialists() {
    }

    public Specialists(int numberOfEducationProjectInvolved, int numberOfYearsOfWorkExperience, String fullName, String dateOfBirth, String id, long salary) {
        super(fullName, dateOfBirth, id, salary);
        this.numberOfEducationProjectInvolved = numberOfEducationProjectInvolved;
        this.numberOfYearsOfWorkExperience = numberOfYearsOfWorkExperience;
    }

    public Specialists(int numberOfEducationProjectInvolved, int numberOfYearsOfWorkExperience) {
        this.numberOfEducationProjectInvolved = numberOfEducationProjectInvolved;
        this.numberOfYearsOfWorkExperience = numberOfYearsOfWorkExperience;
    }

    static Scanner sc = new Scanner(System.in);
    private int numberOfEducationProjectInvolved;
    private int numberOfYearsOfWorkExperience;
    ArrayList<String> EducationCode = new ArrayList<>();
    private int count = 0;

    @Override
    public void Input() {
        super.Input();
        System.out.println("Input number of Educational projects involved: ");
        numberOfEducationProjectInvolved = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfEducationProjectInvolved; i++) {
            System.out.print("\nInput project number " + i + ": ");
            try {
                String name = sc.nextLine();
                if (name.matches("[A-Za-z]\\d{2}.*")) {
                    EducationCode.add(name);
                    if (name.startsWith("T")) {
                        count++;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Please input again following the rule of project code (a letter followed by two digits).");
                i--;
            }
        }
        System.out.println("Input Number Of Years Of Work Experience: ");
        numberOfYearsOfWorkExperience = sc.nextInt();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("\nNumber Of Years Of Work Experience: " + numberOfYearsOfWorkExperience + "\nNumber of Educational projects involved: " + numberOfEducationProjectInvolved + "\n");
        OutputListEducationCodes();
        OutputSalary();
    }

    @Override
    public long CaculateSalary() {
        return (long) (numberOfYearsOfWorkExperience * 4 + count) * 18000;
    }

    public void OutputListEducationCodes() {
        System.out.println("List Project Codes: ");
        for (int i = 0; i < EducationCode.size(); i++) {
            System.out.println(EducationCode.get(i));
        }
    }

    @Override
    public String GetType() {
        return "Specialists";
    }

}
