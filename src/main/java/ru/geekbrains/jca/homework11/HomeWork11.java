package ru.geekbrains.jca.homework11;

import org.omg.CORBA.Object;

import java.util.ArrayList;

public class HomeWork11 {
    public static void main(String[] args) {
        String[] arrayStringExample = new String[]{"Cat", "Dog", "Bird", "Car"}; // Создание стрингового массива
//Exercise 1
        System.out.println("Exercise 1");
        printArray(arrayStringExample); // печать стриногового массива
        Replacement.changeElementArray(arrayStringExample, 0, 3); // замена элементов в стриноговом массиве

        System.out.println();

        Integer[] arrayIntegerExample = new Integer[]{1, 2, 3, 4, 5};

        printArray(arrayIntegerExample); //печать интового массива
        Replacement.changeElementArray(arrayIntegerExample, 2,4); // замена элементов в интовом массиве
//Exercise 2
        System.out.println("Exercise 2");
        System.out.println(arrayIntegerExample); // Проверка простой печати массива
        System.out.println(Replacement.arrayToArrayList(arrayIntegerExample)); // Преобразование массива в ArrayList и его печать для проверки
        System.out.println(Replacement.arrayToArrayList(arrayStringExample)); // Преобразование массива в ArrayList и его печать для проверки
//Exercise 3
        System.out.println("Exercise 3");
        Apple apple1 = new Apple(0.2f); // Создание фруктов
        Apple apple2 = new Apple(0.3f);
        Apple apple3 = new Apple(0.4f);
        Apple apple4 = new Apple(0.4f);
        Apple apple5 = new Apple(0.4f);
        Orange orange1 = new Orange(0.1f);
        Orange orange2 = new Orange(0.5f);
        Orange orange3 = new Orange(0.1f);
        Orange orange4 = new Orange(0.2f);
        Box<Apple> box1= new Box<>(); // Создание 1ой коробки с яблоками
        box1.addFruit(apple1); // вызов метода добавления фрутов в первую коробку
        box1.addFruit(apple2);
        box1.addFruit(apple3);
        Box<Orange> box2= new Box<>(); // Создание 2ой коробки с апельсинами
        box2.addFruit(orange1); // вызов метода добавления фрутов во вторую коробку
        box2.addFruit(orange2);
        box2.addFruit(orange3);
        box2.addFruit(orange4);
        Box<Apple> box3= new Box<>(); // Создание 3ей коробки с яблоками
        box3.addFruit(apple4); // вызов метода добавления фрутов в третью коробку
        box3.addFruit(apple5);
        System.out.println("Weight box with apples = " + box1.getWeightBox()); // вызов метода веса 1ой короки и печать
        System.out.println("Weight box with oranges = " + box2.getWeightBox()); // вызов метода веса 2ой короки и печать
        System.out.println(box1.compare(box2)); // вызов метода сравнения 1ой коробки со 2ой
        box1.shift(box3); // вызов метода пересыпания фруктов из 3-ей коробки в первую
        System.out.println("Weight box1 with apple box's 3 =" + box1.getWeightBox()); // вызов метода веса 1ой короки после преобразований и печать
    }



    static void  printArray(String[] arr) { //метод печати стрингового массива
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y] + "  ");
        }
        System.out.println();
    }
    static void  printArray(Integer[] arr) { //метод печати интового массива
        for (int y = 0; y < arr.length; y++) {
            System.out.print(arr[y] + "  ");
        }
        System.out.println();
    }




}


