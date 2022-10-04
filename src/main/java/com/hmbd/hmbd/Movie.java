package com.hmbd.hmbd;

import java.util.ArrayList;

public class Movie {
    public static ArrayList<Movie> movies = new ArrayList<>();

    public Integer id;
    public String title;
    public String description;
    public Integer year;

    public Movie(Integer id, String title, String description, Integer year) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;

        Movie.movies.add(this);
    }

    static {
        new Movie(1, "Fight Club",
                "A depressed man (Edward Norton) suffering from insomnia meets a strange soap salesman named Tyler Durden (Brad Pitt) and soon finds himself living in his squalid house after his perfect apartment is destroyed",
                1999);
        new Movie(2, "Spider-Man: No Way Home",
                "Spider-Man: No Way Home is a 2021 American superhero film based on the Marvel Comics character Spider-Man, co-produced by Columbia Pictures and Marvel Studios and distributed by Sony Pictures Releasing.",
                2021);

    }

    public ArrayList<Actor> getMovies() {
        ArrayList<Actor> movieActors = new ArrayList<>();
        for (Actor actor : Actor.actors) {
            if (actor.movieId == this.id) {

                movieActors.add(actor);
            }
        }
        return movieActors;
    }

}
