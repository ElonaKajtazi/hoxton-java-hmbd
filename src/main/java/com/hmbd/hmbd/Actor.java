package com.hmbd.hmbd;

import java.util.ArrayList;

public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();

    public Integer id;
    public String name;
    public String lastName;
    public Integer yearOfBirth;
    public Integer movieId;

    public Actor(Integer id, String name, String lastName, Integer yearOfBirth, Integer movieId) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.movieId = movieId;

        Actor.actors.add(this);

    }

    static {
        new Actor(1, "Brad", "Pitt", 1963, 1);
        new Actor(2, "Tom", "Holland", 1996, 2);
        new Actor(3, "Edward", "Norton", 1993, 1);
        new Actor(4, "Zendaya", "Coleman", 1996, 2);
    }
}
