package day34_GarbageCollection_AccessModifiers;

import day33_Statics.tasks.Iphone;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = "Wooden Spoon"; // after line 8, "Wooden Spoon" will be eligible for garbage collection
        str = null;

        System.out.println(str);

        Iphone iphone = new Iphone("iphone14ProMax",1000,"Black","Large");
        iphone = null;

        System.out.println(iphone);

        System.out.println("-----------------------------------------------------------------------------------------");



    }

}
