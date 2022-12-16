package day39_Recap.cydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()){
            System.out.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'f' || gender == 'M' || gender == 'm')){
            System.out.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat(String food){
        System.out.println(getName() + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(getName() + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(getName() + " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
