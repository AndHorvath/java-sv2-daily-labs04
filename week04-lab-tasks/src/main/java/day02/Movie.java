package day02;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private final String title;
    private final int yearOfPremiere;
    private List<Actor> actorList;

    public Movie(String title, int yearOfPremiere) {
        this.title = title;
        this.yearOfPremiere = yearOfPremiere;
        this.actorList = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        actorList.add(actor);
    }

    public int actorsInTheirTwenties() {
        int actorsInTheirTwenties = 0;
        int age;

        for (Actor actor : actorList) {
            age = yearOfPremiere - actor.getYearOfBirth();

            if (20 <= age && age < 30) {
                actorsInTheirTwenties += 1;
            }
        }
        return actorsInTheirTwenties;
    }
}