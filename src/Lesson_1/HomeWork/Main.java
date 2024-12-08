package Lesson_1.HomeWork;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Number> list = new LinkedList<>(
                List.of(15, 11.489f, 45L, 5.265, (short) (-8))
        );

        System.out.println(
                NumberHandler.getArithmeticMean(list)
        );
    }
}
