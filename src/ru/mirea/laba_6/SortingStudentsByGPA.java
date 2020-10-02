package ru.mirea.laba_6;

public class SortingStudentsByGPA {
    static void gPASort (Comparable[] list, int left, int right) {
        if (list.length <= 1) { return; }
        int index = partition(list, left, right);
        if (left < index - 1) { gPASort(list, left, index - 1);}
        if (index < right) { gPASort(list, index, right); }
    }

    static int partition(Comparable[] list, int left, int right) {
        int p = (left + right) / 2;
        int i = left;
        int j = right;
        while (i <= j) {
            while (list[p].compareTo(list[i]) > 0) { i++; }
            while (list[p].compareTo(list[j]) < 0) { j--; }
            if (i <= j) {
                Comparable buff = list[i];
                list[i] = list[j];
                list[j] = buff;
                i++;
                j--;
            }
        }
        return i;
    }

    public static void gPASort(Comparable[] list) {
        gPASort(list, 0, list.length - 1);
    }
}
