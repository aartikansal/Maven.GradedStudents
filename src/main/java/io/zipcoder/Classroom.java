package io.zipcoder;
import java.util.*;


public class Classroom {

    private Student[] students;

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom(Integer maxNumberOfStudents) {
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom() {
        this(30);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (Student student : students){
            sum += student.getAverageExamScore();
        }
        return sum/students.length;
    }

    public void addStudent(Student student){
        boolean inserted = false;
        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                students[i] = student;
                inserted = true;
                break;
            }
        }
        if (!inserted) {
            Student[] tempArray = Arrays.copyOf(students, students.length + 1);
            tempArray[tempArray.length - 1] = student;
        }
    }







}
