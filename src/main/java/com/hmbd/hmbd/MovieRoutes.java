package com.hmbd.hmbd;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRoutes {
    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return Movie.movies;
    }

    // @GetMapping("movieActors")
}
