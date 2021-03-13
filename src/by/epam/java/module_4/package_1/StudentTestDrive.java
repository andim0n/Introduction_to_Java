package by.epam.java.module_4.package_1;

import java.util.Arrays;
import java.util.Random;

public class StudentTestDrive {
    public static void main(String[] args) {

        Student[] students = generateStudents(10);

        for (Student student : students) {
            System.out.println(student);
        }

        Student.searchExcellent(students);


    }

    public static Student[] generateStudents(int quantity) {

        Student[] students = new Student[quantity];

        for (int i = 0; i < quantity; i++) {
            students[i] = new Student("Student" + i, "A. A.", "group-" + i, generateProgress(5));
        }

        return students;
    }

    public static int[] generateProgress(int quantity) {

        Random random = new Random();
        int[] progress = new int[quantity];

        for (int i = 0; i < progress.length; i++) {

            progress[i] = random.nextInt(19);
            if (progress[i] > 10)
                progress[i] = 10;
        }
        return progress;
    }
}
