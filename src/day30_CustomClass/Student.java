package day30_CustomClass;

public class Student {

    public String name;
    public char gander;
    public int age;
    public int ID;
    public char grade;

    public void setInfo(String name, char gander, int age, int ID, char grade) {
        this.name = name;
        this.gander = gander;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", gander=" + gander +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){

        System.out.println(name + " is coding");

    }

    public void sleep(){

        System.out.println(name + " is sleeping");

    }

}
