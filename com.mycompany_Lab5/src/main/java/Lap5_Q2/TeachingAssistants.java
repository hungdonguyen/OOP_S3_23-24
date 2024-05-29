
package Lap5_Q2;

import java.io.Serializable;


public class TeachingAssistants extends Staffmembers implements Serializable{

    public int getNumberOfSubject() {
        return numberOfSubject;
    }

    public void setNumberOfSubject(int numberOfSubject) {
        this.numberOfSubject = numberOfSubject;
    }

    public TeachingAssistants() {
    }

    public TeachingAssistants(int numberOfSubject, String fullName, String dateOfBirth, String id, long salary) {
        super(fullName, dateOfBirth, id, salary);
        this.numberOfSubject = numberOfSubject;
    }

    public TeachingAssistants(int numberOfSubject) {
        this.numberOfSubject = numberOfSubject;
    }
    private int numberOfSubject;
    
    @Override
    public void Input() {
        super.Input();
        
        System.out.println("\nInput number of subject assistant: ");
        numberOfSubject = sc.nextInt();
        
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("\nNumber of subject assistant: " + numberOfSubject);
        super.OutputSalary();
    }
    

    @Override
    public long CaculateSalary() {
        return (long) (numberOfSubject*0.3*18000);
    }
    
}
