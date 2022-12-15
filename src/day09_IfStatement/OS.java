package day09_IfStatement;

public class OS {

    public static void main(String[] args) {

        String brand = "Sony";
        String os = "";

        if (brand == "Mac"){
            os = "MacOS";
        } else if (brand == "Lenovo") {
            os = "Windows";
        } else if (brand == "Iphone") {
            os = "IOS";
        } else {
            os = "Android";
        }

        System.out.println("Your operating system is " + os);

    }

}
