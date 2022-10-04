package com.hmbd.hmbd;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorRoutes {
    @GetMapping("/actors")
    public ArrayList<Actor> getActors() {
        // Actor actor = new Actor(1, "Brad", "Pitt", 1963);
        return Actor.actors;
    }

}
