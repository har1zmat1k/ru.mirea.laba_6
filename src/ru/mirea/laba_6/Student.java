package ru.mirea.laba_6;

public class Student implements Comparable<Student> {
    int iDNumber;
    String Name = "none";
    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        Name = name;
    }

    @Override
    public int compareTo(Student s) {
        return Integer.compare(iDNumber, s.iDNumber);
    }

    @Override
    public String toString() { return "ID: " + this.iDNumber + "\t" + this.Name; }
}
