package day31_Constructors.tasks;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void takeOrder(){

        System.out.println(name + " is taking an order");

    }

    public void cleanTable(){

        System.out.println(name + " is cleaning the table");

    }

    public String toString() {
        if (fullTime == true) {
            return "Server{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", fullTimeStatus=full-time" +
                    '}';
        }else {
            return "Server{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", fullTimeStatus=part-time" +
                    '}';
        }
    }
}
/*
Create a class called Server
        Attributes:
                name (String), employeeID (int),hourlyRate (double), fullTime (boolean)
                Add A constructor that can set all the fields
        Actions: (all void methods)
            takeOrder(): server's name + "is taking an order"
            cleanTable(): server's name + "is cleaning the table"
            toString(): Returns (String) all the information of a Server
                -> Extra: For fullTime status,instead of printing a boolean value, print "full-time" or "part-time"
 */