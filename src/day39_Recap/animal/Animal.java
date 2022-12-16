package day39_Recap.animal;

public class Animal {

    private String name, breed;
    private char gender;
    private int age;
    private String size, color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setSize(size);
        setColor(color);
    }

    public void setName(String name) {
        if (name == null){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public void setBreed(String breed) {
        if (breed == null){
            System.err.println("Invalid breed: " + breed);
            System.exit(1);
        }

        if (breed.isBlank() || breed.isEmpty()){
            System.err.println("Invalid breed: " + breed);
            System.exit(1);
        }
        this.breed = breed;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.err.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        if (color == null){
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }

        if (color.isEmpty() || color.isBlank()){
            System.err.println("Invalid color: " + color);
            System.exit(1);
        }
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void eat(){
        System.out.println(getName() + " is eating");
    }

    public void drink(){
        System.out.println(getName() + " is drinking");
    }

    public void sleep(){
        System.out.println(getName() + " is sleeping");
    }

    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
