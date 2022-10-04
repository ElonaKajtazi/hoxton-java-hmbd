package com.hmbd.hmbd;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorRoutes {
    @GetMapping("/actors")
    public ArrayList<Actor> getActors() {
        // Actor actor = new Actor(1, "Brad", "Pitt", 1963);
        return Actor.actors;
    }

    @GetMapping("/actors/{id}")
    public Actor getSinglActor(@PathVariable Integer id) {
        Actor match = null;
        for (Actor actor : Actor.actors) {
            if (actor.id == id) {
                match = actor;
            }
        }
        if (match == null) {
            throw new Error("Actor not found");
        }
        return match;
    }

    @PostMapping("/actors")
    public Actor createActor(@RequestBody Actor actor) {
        return actor;
    }
}
