package me.petrolingus.task01.task0104;

public class BookTest {

    public static void main(String[] args) {

        Author author1 = new Author("Alice", "alice@outlook.com", 'f');
        Author author2 = new Author("Bob", "bob@gmail.com", 'm');

        Author[] authors = {author1, author2};

        Book book = new Book("Thinking in Java", authors, 120);

        System.out.println(book);

        System.out.println(book.getAuthorNames());

    }
}
