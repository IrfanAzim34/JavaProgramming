package day36_Inheritance.tasks.book;

public class Book {

    public String title, type, author;
    public double price;

    public Book(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=$" + price +
                '}';
    }
}
/*
create a class named Book:
    variables:
        title, type, author, price
    Methods:
        setInfo()
        toString()
 */