package Lesson_1.HomeWork;

import java.util.List;

public class NumberHandler {
    private NumberHandler() {}

    public static <T extends Number> double getArithmeticMean(List<T> numbers){

        return numbers.stream().mapToDouble(Number::doubleValue).average().orElse(0);
    }
}
