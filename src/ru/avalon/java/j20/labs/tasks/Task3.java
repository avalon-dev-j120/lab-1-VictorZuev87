package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Fibonacci;

import java.util.Iterator;

/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {

        Fibonacci fibonacci = new Fibonacci(20);
        Iterator<Integer> it = fibonacci.iterator();
        int sum = 0;
        
        while (it.hasNext()) {
            sum += it.next();
        }
    }
}
