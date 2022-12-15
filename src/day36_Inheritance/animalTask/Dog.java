package day36_Inheritance.animalTask;

public class Dog extends Animal{ // Dog Is An Animal
    //        ^             ^
    //      SubCls      SuperCls

    public void bark(){
        System.out.println(name + " is barking");
    }

}
/*
Dog extends Animal:
			bark()
 */