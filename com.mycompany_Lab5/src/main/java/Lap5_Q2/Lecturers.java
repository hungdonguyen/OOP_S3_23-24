
package Lap5_Q2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Maytinh
 */
public class Lecturers extends Staffmembers implements Serializable {

    public String getAcademicRank() {
        return academicRank;
    }

    public void setAcademicRank(String academicRank) {
        this.academicRank = academicRank;
    }

    public String getAcacdemicDegree() {
        return acacdemicDegree;
    }

    public void setAcacdemicDegree(String acacdemicDegree) {
        this.acacdemicDegree = acacdemicDegree;
    }

    public int getYearOfTeachingExperience() {
        return yearOfTeachingExperience;
    }

    public void setYearOfTeachingExperience(int yearOfTeachingExperience) {
        this.yearOfTeachingExperience = yearOfTeachingExperience;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public void setNumberOfSubjects(int numberOfSubjects) {
        this.numberOfSubjects = numberOfSubjects;
    }

    public ArrayList<String> getListOfSubjects() {
        return listOfSubjects;
    }

    public void setListOfSubjects(ArrayList<String> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }

    public Lecturers(String academicRank, String acacdemicDegree, int yearOfTeachingExperience, int numberOfSubjects, String fullName, String dateOfBirth, String id, long salary) {
        super(fullName, dateOfBirth, id, salary);
        this.academicRank = academicRank;
        this.acacdemicDegree = acacdemicDegree;
        this.yearOfTeachingExperience = yearOfTeachingExperience;
        this.numberOfSubjects = numberOfSubjects;
    }

    public Lecturers(String academicRank, String acacdemicDegree, int yearOfTeachingExperience, int numberOfSubjects) {
        this.academicRank = academicRank;
        this.acacdemicDegree = acacdemicDegree;
        this.yearOfTeachingExperience = yearOfTeachingExperience;
        this.numberOfSubjects = numberOfSubjects;
    }
    static Scanner sc = new Scanner(System.in);

   
    public Lecturers() {
    }

  
    private String academicRank;
    private String acacdemicDegree;
    private int yearOfTeachingExperience;
    private int numberOfSubjects;
    ArrayList<String> listOfSubjects = new ArrayList<>();
    
    @Override
    public void Input() {
        super.Input();
        System.out.println("Input Academic Rank: ");
        academicRank=sc.nextLine();
        System.out.println("Input Academic Degree: ");
        acacdemicDegree = sc.nextLine();
        System.out.println("Input Year Of Teaching Experience: ");
        yearOfTeachingExperience = sc.nextInt();
        System.out.println("Input Number of Subject: ");
        numberOfSubjects = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=numberOfSubjects;i++) {
            System.out.print("\nInput Name Subject " + i +": ");
            String name = sc.nextLine();
            listOfSubjects.add(name);
        }
    }
    
    @Override
    public void Output() {
        super.Output();
        System.out.println("\nAcademic Rank: " + academicRank + "\nAcademic Degree: " + acacdemicDegree + "\nNumber Of Year Teaching Experience: " + numberOfSubjects);
        OutputListSubjects();
        super.OutputSalary();
    }

    @Override
    public long CaculateSalary() {
        return (long) (numberOfSubjects*yearOfTeachingExperience*0.12*20000);
    }
    
    public void OutputListSubjects() {
        System.out.println("List Subjects: ");
        for (int i=0; i<listOfSubjects.size(); i++) {
            System.out.println(listOfSubjects.get(i));
        }
    }

    @Override
    public String GetType() {
        return "Lecturers";
    }
}
