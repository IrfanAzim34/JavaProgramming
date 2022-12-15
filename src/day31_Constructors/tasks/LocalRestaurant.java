package day31_Constructors.tasks;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Irfan","Istanbul",50);
        Server server1 = new Server("John",12,12,true);
        Server server2 = new Server("David",22,11.5,false);
        Server server3 = new Server("Ali",32,10,false);
        Server server4 = new Server("Ayse",52,13,true);
        Server server5 = new Server("Alina",43,12.5,true);

        Server[] servers = {server1,server2,server3,server4,server5};


        Chef chef1 = new Chef("Chris",75,25,true);
        Chef chef2 = new Chef("Davut",73,22,false);
        Chef chef3 = new Chef("Ahmet",78,24,true);

        Chef[] chefs = {chef1,chef2,chef3};

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        for (Server server : restaurant.serversList) {
            System.out.println(server);
        }
        System.out.println();
        for (Chef chef : restaurant.chefsList) {
            System.out.println(chef);
        }

        System.out.println(restaurant);
        System.out.println("-----------------------------------------------------------------------------------------");

        restaurant.terminateServer(12);
        restaurant.terminateChef(75);

        for (Server server : restaurant.serversList) {
            System.out.println(server);
        }
        System.out.println();
        for (Chef chef : restaurant.chefsList) {
            System.out.println(chef);
        }

        System.out.println(restaurant);

        restaurant.chefsList.removeIf(p-> p.fullTime== true);

    }

}
/*
Create a class LocalRestaurant that has a main
method with the following:
        - Make a Restaurant object
        - Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
        - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object
        - Print your whole restaurants information
 */