package day39_Recap.animal;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, char gender, int age, String size, String color, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isPlayable);
    }

    public void swim(){
        System.out.println(getName() + " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dolphin food");
    }
}
