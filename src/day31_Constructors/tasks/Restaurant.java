package day31_Constructors.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String Owner, Location;
    public int numbersOfStars;
    public ArrayList<Server> serversList = new ArrayList<>();
    public ArrayList<Chef> chefsList = new ArrayList<>();

    public Restaurant(String Owner, String Location, int numbersOfStars) {
        this.Owner = Owner;
        this.Location = Location;
        this.numbersOfStars = numbersOfStars;
    }

    public void hireServer(Server server){
        serversList.add(server);
    }

    public void hireServer(Server[] servers){
        serversList.addAll(Arrays.asList(servers));
    }

    public void hireChef(Chef chef){
        chefsList.add(chef);
    }

    public void hireChef(Chef[] chefs){
        chefsList.addAll(Arrays.asList(chefs));
    }

    public void terminateChef(int employeeID){
        chefsList.removeIf(p-> p.employeeID == employeeID);
    }

    public void terminateServer(int employeeID){
        serversList.removeIf(p-> p.employeeID == employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "Owner='" + Owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numbersOfStars=" + numbersOfStars +
                ", numberOfServers=" + serversList.size() +
                ", numberOfChefs=" + chefsList.size() +
                '}';
    }
}
/*
Create a class called Restaurant
            Attributes:
                Owner (String), Location (String), numberOfStars (int)
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)
            Add a constructor that sets the owner, location, and number of stars.

            Actions: (all void methods)
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList

                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList

                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList

                terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef

                terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server

                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole
                list of Servers or Chefs. Print the number of Servers and Chefs along side the other information
 */