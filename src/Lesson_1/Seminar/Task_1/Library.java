package Lesson_1.Seminar.Task_1;

import java.util.LinkedList;
import java.util.List;

public class Library <T extends Book>{
    private final List<T> books;

    public Library(){
        this.books = new LinkedList<>();
    }

    public void addBook(T book){
        if (!this.books.contains(book)){
            this.books.add(book);
        }
    }

    public List<T> getByAuthor(String author){
        return this.books.stream().
                filter(book -> book.author().equals(author)).
                toList();
    }

    public List<String> getByUniqueTitle(){
        return this.books.stream().
                map(Book::title).
                distinct().
                toList();
    }

    public List<T> getByYear(int publicationYear){
        return this.books.stream().
                filter(book -> book.publicationYear() > publicationYear).
                toList();
    }
}
