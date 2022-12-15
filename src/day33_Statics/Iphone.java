package day33_Statics;

public class Iphone {

    public static String brand = "Iphone";
    public String model;
    public double price;
    public static String OS = "IOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasCamera = true;
    public static boolean hasFacetime = true;

//    public static void modelPrice(){ // static method does not accept instances
//        System.out.println(model + " : " + price);
//        System.out.println(OS);
//        }
    public void modelPrice(){
        System.out.println(model + " : " + price);
        System.out.println(OS);
    }

    public static void printOS(){
        System.out.println(OS);
    }

}
