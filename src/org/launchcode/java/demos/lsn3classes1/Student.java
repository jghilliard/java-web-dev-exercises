package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public void setName(String sName){
        this.name = sName;
    }

    public String getName(){
        return this.name;
    }
    public void setID(int iD){
        this.studentId = iD;
    }
    public int getID(){
        return this.studentId;
    }


}