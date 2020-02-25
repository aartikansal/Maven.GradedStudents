package io.zipcoder;

import org.junit.Test;

public class StudentTest {

    // ADDED BY AARTI ON 02/24
    @Test
    public void getExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.getExamScores();

        // Then
        System.out.println(output);
    }

    @Test
    public void addExamScoresTest() {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {};
        Student student = new Student(firstName, lastName, examScores);

        // When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        // Then
        System.out.println(output);

    }

    @Test
    public void setExamScoreTest(){
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);
// When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();
// Then
        System.out.println(output);
    }

    @Test
    public void getAverageExamScoreTest() {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = {100.0, 150.0, 250.0, 0.0};
        Student student = new Student(firstName, lastName, examScores);

        // When
        double output = student.getAverageExamScore();

        // Then
        System.out.println(output);
    }

    @Test
    public void toStringTest()
    {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 150.0, 250.0, 0.0 };
        Student student = new Student(firstName, lastName, examScores);

        // When
        String output = student.toString();

        // Then
        System.out.println(output);

    }

}