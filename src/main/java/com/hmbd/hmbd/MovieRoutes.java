package com.hmbd.hmbd;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRoutes {
    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return Movie.movies;
    }

    @GetMapping("/movies/{id}")
    public Movie getSingleMovie(@PathVariable Integer id) {
        Movie match = null;
        for (Movie movie : Movie.movies) {
            if (movie.id == id) {
                match = movie;
            }
        }
        if (match == null) {
            throw new Error("Movie not found");

        }
        return match;

    }

    @PostMapping("/movies")
    public Movie createMovie (@RequestBody Movie movie) {
        return movie;
    }
}
