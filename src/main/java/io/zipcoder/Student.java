package io.zipcoder;

import java.util.ArrayList;
import java.util.Date;
import java.util.Arrays;


public class Student {

    // ADDED BY AARTI ON 02/24

    //a collection of characters representative of a first name.
    private String firstName = "";
    // a collection of characters representative of a last name.
    private String lastName = "";
    //a dynamic collection of decimal values representative of test scores.
    private ArrayList<Double> examScores;

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

    public int getNumberOfExamsTaken() {
        return examScores.size();
    }


    public String getExamScores() {
        String scores = "Exam Scores:\n";
        for (int i = 0; i < examScores.size(); i++) {
            scores += " \tExam " + (i + 1) + " -> " + examScores.get(i).intValue() + "\n";
        }
        return scores;
    }

    public void addExamScore(Double eScore) {
        examScores.add(eScore);
    }

    public void setExamScore(int examNumber, double newScore) {
        examScores.remove(examNumber - 1);
        examScores.add(examNumber - 1, newScore);
    }

    public double getAverageExamScore(){
        Double examScore=0.0;
        Double average=0.0;
        for(int i = 0; i < examScores.size(); i++){
            examScore += examScores.get(i);
            average = examScore / examScores.size();
        }
        return average;
    }

    public String toString(){
        String str = "Student Name: " + firstName + " " + lastName + "\n" +
                "Average Score: " + getAverageExamScore() + "\n" +
                getExamScores();
        return str;
    }



}
