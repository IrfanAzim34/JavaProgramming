package day39_Recap.student;

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            System.err.println("Invalid Name");
            System.exit(1);
        }
        for (int i = 0; i < name.length(); i++) {
            if (!(Character.isLetterOrDigit(name.charAt(i))) && name.charAt(i) != ' '){
                System.err.println("Name Can Not contain special characters,expect the space ");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            System.err.println("Invalid Age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public void setGender(char gender) {
        String temp = "" + gender;

        if (!(temp.equalsIgnoreCase("F") || temp.equalsIgnoreCase("M"))){
            System.err.println("Invalid Gender: " + gender);
            System.exit(1);
        }
        this.gender = temp.toUpperCase().charAt(0);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
