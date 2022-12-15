package day31_Constructors.tasks;

public class MovieObjects {

    public static void main(String[] args) {

        Movie movie = new Movie("USA","Journey to SDEt: Cydeo Batch 25","10/25/2021","Kuzzet Altay");

        String[] cats = {"Asiya","Adam","Muhta"};
        movie.addCasts(cats);
        movie.addCast("Irfan");
        movie.addCast("Azim");

        System.out.println(movie);

    }

}
