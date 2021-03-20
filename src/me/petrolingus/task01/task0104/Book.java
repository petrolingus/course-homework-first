package me.petrolingus.task01.task0104;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Book {

    private String name;

    private Author[] authors;

    private double price;

    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors={" + Arrays.stream(authors)
                .map(Author::toString)
                .collect(Collectors.joining(", ")) + "}" +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }

    public String getAuthorNames() {
        return Arrays.stream(authors)
                .map(Author::getName)
                .collect(Collectors.joining(", "));
    }
}
