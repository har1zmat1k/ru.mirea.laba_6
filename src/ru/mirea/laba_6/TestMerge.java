package ru.mirea.laba_6;

public class TestMerge {
    public static void main(String[] args) {
        Student[] studentsFirstGroup = {new Student(4, "D"), new Student(5, "E"), new Student(3, "C"), new Student(1, "A"), new Student(2, "B")};
        Student[] studentsSecondGroup = {new Student(9, "I"), new Student(6, "F"), new Student(8, "H"), new Student(7, "G")};
        Student[] std = new Student[studentsFirstGroup.length + studentsSecondGroup.length];
        MergeSorting.mergeSorting(studentsFirstGroup, studentsSecondGroup, std);

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());
        }
    }
}
