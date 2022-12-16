package day39_Recap.animal;

public class WildAnimal extends Animal{
    
    private boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color, boolean isPlayable) {
        super(name, breed, gender, age, size, color);
        setWild(true);
        setFriendly(false);
        setPlayable(isPlayable);
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public boolean getWild() {
        return isWild;
    }

    public boolean getFriendly() {
        return isFriendly;
    }

    public boolean getPlayable() {
        return isPlayable;
    }

    public void hunt(){
        System.out.println(getName() + " is hunting");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", is wild='" + getWild() + '\'' +
                ", is friendly='" + getFriendly() + '\'' +
                ", is playable='" + getPlayable() + '\'' +
                '}';
    }
}
