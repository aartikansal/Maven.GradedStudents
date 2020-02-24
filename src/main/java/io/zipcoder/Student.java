package io.zipcoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.Arrays;


public class Student {

    // ADDED BY AARTI ON 02/24

    //a collection of characters representative of a first name.
    String firstName = "";
    // a collection of characters representative of a last name.
    String lastName = "";
    //a dynamic collection of decimal values representative of test scores.
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));

    }


    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String LName) {
        this.lastName = LName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfExamsTaken()
    {
        return examScores.size();
    }

    public String getExamScores(){
        String scores = "Exam Scores:\n";
        for (int i = 0; i < examScores.size(); i++){
            scores += " \tExam " + (i+1) + " -> " + examScores.get(i).intValue() + "\n";
        }
        return scores;
    }

    public void addExamScore(Double eScore){
        examScores.add(eScore);
    }

    public void setExamScores(int examNumber, double newScore) {
        examScores.remove(examNumber-1);
        examScores.add(examNumber-1, newScore);
    }



}
