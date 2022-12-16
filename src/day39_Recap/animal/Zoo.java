package day39_Recap.animal;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Hogi","Haski",'F',3,"Small","Black",true);
        Cat cat = new Cat("Simba","British",'M',2,"Small","White",true);
        Dolphin dolphin = new Dolphin("Hulu","XX",'F',4,"Medium","Grey",true);
        Parrot parrot = new Parrot("Gugu","UU",'M',5,"Small","Yellow",true);

        Lion lion = new Lion("Singo","India",'F',3,"Large","Orange",false);
        Tiger tiger = new Tiger("Yolvas","Bengal",'M',4,"Large","White",false);
        Eagle eagle = new Eagle("Burkut","Tanri",'F',1,"Medium","Black",false);
        Bear bear = new Bear("Ayi","Sebirya",'M',2,"Large","Black",false);


        System.out.println("---------------------------------------------------------------");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(dolphin);
        System.out.println(parrot);
        System.out.println(lion);
        System.out.println(tiger);
        System.out.println(eagle);
        System.out.println(bear);

        System.out.println("----------------------------------------------------------------------");

        dog.eat();
        dog.bark();
        cat.eat();
        cat.meow();
        cat.scratch();
        dolphin.eat();
        dolphin.swim();
        parrot.eat();
        parrot.fly();
        parrot.sing();
        lion.hunt();
        tiger.hunt();
        eagle.hunt();
        bear.hunt();

    }

}
