package day38_Inheritance.animalTask;

public class Animal {

    public String name, breed;
    public int age;
    public char gender;
    public String size, color;

    public Animal(String name, String breed, int age, char gender, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.color = color;
    }

    public void eat(){
        System.out.println(name + " eating");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
