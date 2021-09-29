package ru.geekbrains.jca.homework11;

import java.util.ArrayList;

public class Box <F extends Fruit>{

    private ArrayList<F> box;

    public Box(){
        this.box = new ArrayList<>();
    }

    public void addFruit(F fruit) { //метод добавления фрутов
        box.add(fruit);
    }

    public float getWeightBox () { // метод для вычисления веса коробки. Немного отступил от задания, т.к. каждый фрукт
        // у меня может быть разного веса, поэтому зная количество фруктов и вес одного фрукта будет невозможно
        // вычислить реальный вес коробки
        Fruit fruit;
        float weigtbox = 0f;
        for (int i = 0; i < box.size(); i++) {
            fruit = box.get(i);
            weigtbox = weigtbox + fruit.getWeight();
        }
        return weigtbox;
    }

    public boolean compare(Box<?> anotherBox) { //метод сравнения одной коробки с другой
        return Math.abs(getWeightBox() - anotherBox.getWeightBox()) < 0.001;
    }

    public void shift(Box<F> anotherBox) { // метод пересыпания фруктов из одной коробки в другую
        for (int i = 0; i < anotherBox.getBox().size(); i++) { // цикл для добавления фруктов в 1-ю коробку
            box.add(anotherBox.getBox().get(i));
        }
        anotherBox.getBox().clear(); // удаление фруктов из 2-ой коробки
    }

    public ArrayList<F> getBox() {
        return box;
    }

    public void setBox(ArrayList<F> box) {
        this.box = box;
    }
}
