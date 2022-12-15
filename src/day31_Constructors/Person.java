package day31_Constructors;

public class Person {

    public String name;
    public char gander;
    public int age;

    public Person(String name, char gander, int age){

        this.name = name;
        this.gander = gander;
        this.age = age;

    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gander=" + gander +
                ", age=" + age +
                '}';
    }
}
