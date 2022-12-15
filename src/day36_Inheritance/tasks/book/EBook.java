package day36_Inheritance.tasks.book;

public class EBook extends Book{

    public String size;
    public int page;

    public EBook(String title, String author, double price, String size, int page) {
        super(title, "EBook", author, price);
        this.size = size;
        this.page = page;
    }

    public void readBook(){
        System.out.println("Reading " + title);
    }

    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=$" + price +
                ", size='" + size + '\'' +
                ", page=" + page +
                '}';
    }
}
/*
Create a subclass of Book named EBook:
    variables:
        title, type, author, price, size, pages
    Methods:
        setInfo()
        readBook()
        toString()
 */