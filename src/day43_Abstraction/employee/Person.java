package day43_Abstraction.employee;

public abstract   class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if (!(gender == 'F' || gender == 'M')){
            throw new RuntimeException("Invalid gender: " + gender);
        }
        this.gender = gender;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            throw new RuntimeException("Invalid name: " + name);
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new RuntimeException("Invalid age: " + age);
        }
        this.age = age;
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

    public void eat(){
        System.out.println(name + " is eating baklava");
    }

    public abstract void sleep();

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
