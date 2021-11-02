package day01;

public class MovieMain {

    public static void main(String[] args) {
        Movie movie = new  Movie("Movie", 2020);
        Actor actor1 = new Actor("First Actor", 2000);
        Actor actor2 = new Actor("Second Actor", 2001);

        movie.addActor(actor1);
        movie.addActor(actor2);

        System.out.println(movie.actorsInTheirTwenties());
    }
}