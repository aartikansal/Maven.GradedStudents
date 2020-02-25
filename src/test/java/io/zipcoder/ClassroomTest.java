package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ClassroomTest {

    @Test
    public void constructorTest(){
        Classroom classroom = new Classroom();
        Student[] expected = new Student[30];
        Student[] actual = classroom.getStudents();
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void constructorTest3(){
        Double[] exams = {20.0};
        Student student1 = new Student("Mark", "Wahlberg", exams);
        Student student2 = new Student("Smith", "James", exams);
        Student student3 = new Student("Laurie", "Jane", exams);
        Student[] students = {student1, student2, student3};
        Classroom classroom = new Classroom(students);
        Student[] actual = classroom.getStudents();
        Assert.assertArrayEquals(students, actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        Double[] s2Scores = { 225.0, 25.0 };

        Student s1 = new Student("student", "one", s1Scores);
        Student s2 = new Student("student", "two", s2Scores);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        Double expected = 125.0;
        Double actual = classroom.getAverageExamScore();

        System.out.println(actual);

        //Assert.assertEquals(expected, actual);
    }

    @Test
    public void addStudentTest(){
        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        
        Double[] examScores = { 100.0, 150.0, 250.0, 0.00 };
        Student student = new Student("Leon", "Hunter", examScores);

        // When
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        classroom.addStudent(student);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        String expected1 = "[]";
        String expected2 = "[Student Name: Leon Hunter\n" +
                "Average Score: 125\n" +
                "Exam Scores:\n" +
                " \tExam 1 -> 100\n" +
                " \tExam 2 -> 150\n" +
                " \tExam 3 -> 250\n" +
                " \tExam 4 -> 0\n]";

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

}
