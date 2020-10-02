package ru.mirea.laba_6;

public class TestGPA {
    public static void main(String[] args) {
        Student[] students = {new Student(4, "Ivan"), new Student(5, "Nikolay"),
                new Student(3, "Aleksey"), new Student(1, "Dimitry"),
                new Student(2, "Akhmed")};
        SortingStudentsByGPA.gPASort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
}
