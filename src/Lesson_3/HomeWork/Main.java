package Lesson_3.HomeWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> formats = new ArrayList<>(
                Arrays.asList("bin", "json", "xml", "yaml", "bson")
        );
        String fileName = "KirillData";

        Writer writer = new FileHandler();

        Student kirill = new Student(
                "Kirill", 23, 4.12
        );

        // Начнём тестировать!
        System.out.println(
                "До сериализации\n\n" + kirill + "\n\n"
        );

        formats.forEach((format) -> {
            try {
                writer.saveObject(kirill, fileName + "." + format);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("После сериализации\n");

        formats.forEach((format) -> {
            try {
                System.out.println(writer.openObject(fileName + "." + format) + "\n");
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        /*
        Ни в одном из форматов поле GPA не сохранилось.
        Причина заключается в том, что данное поле помечено модификатором transient,
        которые и не позволяет сериализовать поле GPA.
         */
    }
}
