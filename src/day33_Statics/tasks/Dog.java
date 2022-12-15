package day33_Statics.tasks;

public class Dog {

    public String breed, color, size;
    public char gender;
    public int age;

    public static int numberOfLegs = 4, numberOfEyes = 2;
    public static boolean isFriendly = true;

    public Dog(String breed, String color, String size, char gender, int age) {
        this.breed = breed;
        this.color = color;
        this.size = size;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println(color +  " "+ breed + " is eating");
    }

    public void sleep(){
        System.out.println(color +  " " + breed + " is sleeping");
    }

    public void play(){
        System.out.println(color +  " "+ breed + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                ", numberOfEyes=" + numberOfEyes +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
/*
Create a class called Dog
            Attributes:
                instance: breed, size, gender, age, color
                statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly
            Add a constructor to initialized all the fields (instances)
            Methods:
                eat()
                sleep()
                play()
                toString()
 */