package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20);

        List<Integer> list = null;

        Set<Integer> set = null;

        ArrayList<Integer> arrayList = new ArrayList();
        for(Integer a: array) {arrayList.add(a);};

        list = arrayList;

        TreeSet<Integer> treeSet = new TreeSet();
        for(Integer b: array) {treeSet.add(b);};

        set = treeSet;
    }
}
