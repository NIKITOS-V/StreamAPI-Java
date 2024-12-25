package Lesson_2.HomeWork;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printStringClassFields();
    }

    private static void printStringClassFields(){
        Arrays.stream(String.class.getMethods()).forEach(System.out::println);
    }
}
