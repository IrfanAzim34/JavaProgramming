package day36_Inheritance.tasks.book;

public class AudioBook extends Book{

    public int length;
    public String narrator;

    public AudioBook(String title, String author, double price, int length, String narrator) {
        super(title, "Audio Book", author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public void listen(){
        System.out.println("Listening " + title);
    }

    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=$" + price +
                ", length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
/*
Create a subclass of Book named AudioBook:
    variables:
        title, type, author, price, length, narrator
    Methods:
        setInfo()
        listen()
        toString()
 */