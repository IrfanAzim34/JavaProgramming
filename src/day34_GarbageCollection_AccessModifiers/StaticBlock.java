package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static { // runs first before anything, and only runs one time
        System.out.println("Static Block");
    }

}
