package com.hmbd.hmbd;

import java.util.ArrayList;

public class Movie {
    public static ArrayList<Movie> movies = new ArrayList<>();

    public static Integer count = 0;

    public Integer id;
    public String title;
    public String description;
    public Integer year;

    public Movie(String title, String description, Integer year) {
        this.id = count++;
        this.title = title;
        this.description = description;
        this.year = year;

        Movie.movies.add(this);
    }

    static {
        new Movie("Fight Club",
                "A depressed man (Edward Norton) suffering from insomnia meets a strange soap salesman named Tyler Durden (Brad Pitt) and soon finds himself living in his squalid house after his perfect apartment is destroyed",
                1999);
        new Movie("Spider-Man: No Way Home",
                "Spider-Man: No Way Home is a 2021 American superhero film based on the Marvel Comics character Spider-Man, co-produced by Columbia Pictures and Marvel Studios and distributed by Sony Pictures Releasing.",
                2021);

    }

    public ArrayList<Actor> getActors() {
        ArrayList<Actor> movieActors = new ArrayList<>();
        for (Actor actor : Actor.actors) {
            if (actor.movieId == this.id) {

                movieActors.add(actor);
            }
        }

        return movieActors;
    }

}
