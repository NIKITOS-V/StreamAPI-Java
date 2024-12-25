package Lesson_3.Seminar.Task_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "Володи данные.json";

        FileHandler fileHandler = new FileHandler();

        UserData userData = new UserData(
                "ВОЛОДЯ", 7, "123zx!"
        );

        System.out.println(userData);

        fileHandler.saveObject(userData, fileName);

        System.out.println(
                "\n" + fileHandler.openObject(fileName)
        );

        /*
        Поле password не сериализируется т.к помечен модификатором transient,
        который и не позволяет данному полю сериализоваться
         */
    }
}
