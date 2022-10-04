package com.hmbd.hmbd;

import java.util.ArrayList;


public class Actor {
    public static ArrayList<Actor> actors = new ArrayList<>();

    public static Integer count = 0;

    public Integer id;
    public String name;
    public String lastName;
    public Integer yearOfBirth;
    public Integer movieId;

    public Actor(String name, String lastName, Integer yearOfBirth, Integer movieId) {
        this.id = count++;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.movieId = movieId;

        Actor.actors.add(this);
    }

    static {
        new Actor("Brad", "Pitt", 1963, 0);
        new Actor("Tom", "Holland", 1996, 1);
        new Actor("Edward", "Norton", 1993, 0);
        new Actor("Zendaya", "Coleman", 1996, 1);
    }
}
