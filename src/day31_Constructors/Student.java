package day31_Constructors;

public class Student {

    public String name;
    public int age;
    public char gander;
    public char grade;
    public int id;

    public Student(String name, int age, char gander, char grade, int id) {
        this.name = name;
        this.age = age;
        this.gander = gander;
        this.grade = grade;
        this.id = id;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gander=" + gander +
                ", grade=" + grade +
                ", id=" + id +
                '}';
    }


}
