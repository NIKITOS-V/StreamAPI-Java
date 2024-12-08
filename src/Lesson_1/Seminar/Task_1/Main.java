package Lesson_1.Seminar.Task_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Library<Book> library = new Library<>();

        for (int i = 0; i < 25; i++){
            library.addBook(
                    new Book("Title_" + (random.nextInt(10) + 1),
                            "Author_" + (random.nextInt(10) + 1),
                            2000 + (random.nextInt(10) + 1)
                    )
            );
        }

        library.getByAuthor("Author_5").forEach(System.out::println);
        System.out.println();

        library.getByUniqueTitle().forEach(System.out::println);
        System.out.println();

        library.getByYear(2007).forEach(System.out::println);
        System.out.println();
    }
}
