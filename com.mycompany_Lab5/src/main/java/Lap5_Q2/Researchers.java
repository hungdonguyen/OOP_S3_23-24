package Lap5_Q2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maytinh
 */
public class Researchers extends Staffmembers implements Serializable {

    public Researchers() {
    }
    private int count = 0;

    public void setNumberOfProjectInvolved(int numberOfProjectInvolved) {
        this.numberOfProjectInvolved = numberOfProjectInvolved;
    }

    public void setNumberOfYearsOfResearchExperience(int numberOfYearsOfResearchExperience) {
        this.numberOfYearsOfResearchExperience = numberOfYearsOfResearchExperience;
    }

    public void setResearchCodes(ArrayList<String> researchCodes) {
        this.researchCodes = researchCodes;
    }

    public Researchers(int numberOfProjectInvolved, int numberOfYearsOfResearchExperience, String fullName, String dateOfBirth, String id, long salary) {
        super(fullName, dateOfBirth, id, salary);
        this.numberOfProjectInvolved = numberOfProjectInvolved;
        this.numberOfYearsOfResearchExperience = numberOfYearsOfResearchExperience;
    }

    public Researchers(int numberOfProjectInvolved, int numberOfYearsOfResearchExperience) {
        this.numberOfProjectInvolved = numberOfProjectInvolved;
        this.numberOfYearsOfResearchExperience = numberOfYearsOfResearchExperience;
    }
    static Scanner sc = new Scanner(System.in);

    private int numberOfProjectInvolved;
    private int numberOfYearsOfResearchExperience;

    ArrayList<String> researchCodes = new ArrayList<>();

    @Override
    public void Input() {
        super.Input();
        System.out.println("Input number of Research projects involved: ");
        numberOfProjectInvolved = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < numberOfProjectInvolved; i++) {
            System.out.print("\nInput project number " + i + ": ");
            try {
                String name = sc.nextLine();
                if (name.matches("[A-Za-z]\\d{2}.*")) {
                    researchCodes.add(name);
                    if (name.startsWith("D")) {
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
        System.out.println("Input Number Of Years Of Research Experience: ");
        numberOfYearsOfResearchExperience = sc.nextInt();
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("\nNumber Of Years Of Research Experience: " + numberOfYearsOfResearchExperience + "\nNumber of projects involved: " + numberOfProjectInvolved + "\n");
        OutputListProjectCodes();
        OutputSalary();
    }

    @Override
    public long CaculateSalary() {
        return (long) (numberOfYearsOfResearchExperience*2 + count) *20000;
    }
    
    public void OutputListProjectCodes() {
        System.out.println("List Project Codes: ");
        for (int i=0; i<researchCodes.size(); i++) {
            System.out.println(researchCodes.get(i));
        }
    }

}
