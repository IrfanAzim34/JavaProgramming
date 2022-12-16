package day39_Recap.animal;

public class Lion extends WildAnimal{

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isPlayable) {
        super(name, breed, gender, age, size, color, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting lion food");
    }
}
