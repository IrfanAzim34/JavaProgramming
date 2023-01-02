package day45_Abstraction;

public interface PropertiesOfInterface {

//    int a;
    static int b =100;
//    public PropertiesOfInterface(int a){
//        this.a = a;
//    }
//
//    static {
//        b = 1;
//    }

//    public void method1(){
//        System.out.println("Instance Method");
//    }

    static void method2(){ // static method
        System.out.println("Static Method");
    }

    void method3(); // abstract method

    default void drink(){ // default method
        System.out.println("Default Method");
    }

}
