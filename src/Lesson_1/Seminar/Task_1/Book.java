package Lesson_1.Seminar.Task_1;

public record Book(String title, String author, int publicationYear) {

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Book book = (Book) obj;

        return this.author.equals(book.author()) &&
                this.title.equals(book.title()) &&
                this.publicationYear == book.publicationYear();
    }
}
