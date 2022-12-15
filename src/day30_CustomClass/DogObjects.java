package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog2.name = "Ace";
        dog2.breed = "Golden";
        dog2.age = 3;
        dog2.gender = 'M';
        dog2.size = "Small";
        dog2.color = "Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Arko","German Shepard",2,'F',"Large","Black");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog1.bark();


    }

}
