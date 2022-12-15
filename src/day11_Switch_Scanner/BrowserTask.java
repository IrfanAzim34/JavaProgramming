package day11_Switch_Scanner;

public class BrowserTask {

    /*
    write a program that can display the selected browser

        3.1  declare a String variable called browserName
        3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
        3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

    Do Not use if statement or ternary
     */

    public static void main(String[] args) {

        String browserName = "edge",
                result = "";

        switch (browserName){

            case "chrome":
                result = "Selected Browser is Chrome.";
                break;

            case "firefox":
                result = "Selected Browser is FireFox";
                break;

            case "opera":
                result = "Selected Browser is Opera";
                break;

            case "safari":
                result = "Selected Browser is Safari";
                break;

            case "edge":
                result = "Selected Browser is Edge";
                break;

            default:
                result = "Invalid Browser";
        }

        System.out.println(result);

    }
}
