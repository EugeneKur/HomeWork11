package ru.geekbrains.jca.homework11;

import java.util.ArrayList;

public class Replacement {
    public static void changeElementArray(Object[] arr, int index1, int index2) { // метод замены элементов массива по индексам и вывод на печать массива
        Object [] supportingArr = new Object[arr.length];
        for (int i = 0; i < supportingArr.length; i++) {
            supportingArr[i] = arr[i];
        }
        arr [index1] = supportingArr[index2];
        arr [index2] = supportingArr[index1];
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y] + "  ");
        }
        System.out.println();
    }

    public static ArrayList<Object> arrayToArrayList(Object[] arr) { // метод преобразования массива в ArrayList
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        return arrayList;

    }




}
