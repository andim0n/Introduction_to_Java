package by.epam.java.module_4.package_1;

/*

 * 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

 */

import java.util.Arrays;

public class Student {

    static double avg = 9;
    private String surname;
    private String initials;
    private String group;
    private int[] progress;

    public Student(String surname, String initials, String groupNum, int[] progress) {
        this.surname = surname;
        this.initials = initials;
        this.group = groupNum;
        this.progress = progress;
    }

    public String getSurname() {
        return surname;
    }

    public String getGroup() {
        return group;
    }

    public int[] getProgress() {
        return progress;
    }

    public boolean isExcellent() {

        for (int mark : progress) {
            if (mark < 9) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", initials='" + initials + '\'' +
                ", group='" + group + '\'' +
                ", progress=" + Arrays.toString(progress) +
                '}';
    }

    public static void searchExcellent(Student[] students) {

        for (Student student : students) {

            if (student.isExcellent()) {
                System.out.printf("surname: %s, group: %s\n", student.getSurname(), student.getGroup());
            }
        }
    }

}
