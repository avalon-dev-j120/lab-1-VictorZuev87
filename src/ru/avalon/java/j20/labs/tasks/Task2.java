package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

/**
 * Задание №2.
 *
 * <p>Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {

        Point<Float> pointX = new Point(1.4, 2.5);
        Point<Integer> pointY = new Point(4, 7);
        Double distance = pointX.distanceTo(pointY);
    }
}
