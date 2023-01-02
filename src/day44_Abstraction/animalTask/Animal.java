package day44_Abstraction.animalTask;

public abstract class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private int age;
    private String size;
    private final String color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        setName(name);
        if (breed == null || breed.isEmpty() || breed.isBlank()){
            throw new RuntimeException("Invalid Breed:" + breed);
        }
        this.breed = breed;
        if (!(gender == 'F' || gender == 'M')){
            throw new RuntimeException("Invalid Gender: " + gender);
        }
        this.gender = gender;
        setAge(age);
        setSize(size);
        if (color == null || color.isBlank() || color.isEmpty()){
            throw new RuntimeException("Invalid Color: " + color);
        }
        this.color = color;
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()){
            throw new RuntimeException("Invalid name: " + name);
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0){
            throw new RuntimeException("Invalid Age: " + age);
        }
        this.age = age;
    }

    public void setSize(String size) {
        if (!(size.equals("small") || size.equals("medium") || size.equals("large"))){
            throw new RuntimeException("Invalid size: " + size);
        }
        this.size = size;
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

    public abstract void eat();

    public final void drink(){
        System.out.printf(name + " is drinking water");
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
