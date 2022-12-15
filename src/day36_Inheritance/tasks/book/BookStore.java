package day36_Inheritance.tasks.book;

public class BookStore {

    public static void main(String[] args) {

        EBook eBook = new EBook("White Home","David Holdman",30,"Medium",350);
        System.out.println(eBook);
        eBook.readBook();

        System.out.println();

        AudioBook audioBook = new AudioBook("Black Home","John Phillip",40,357,"Oliver John");
        System.out.println(audioBook);
        audioBook.listen();

    }

}
