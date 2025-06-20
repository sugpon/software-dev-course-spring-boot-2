package com.example.mycollections.controllers;

import com.example.mycollections.models.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final List<Movie> movies = new ArrayList<>() {{
        add(new Movie("Pirates of the Caribbean: The Curse of the Black Pearl", "Gore Verbinski", 2003, 143));
        add(new Movie("Pirates of the Caribbean: Dead Man's Chest", "Gore Verbinski", 2006, 151));
        add(new Movie("Pirates of the Caribbean: At World's End", "Gore Verbinski", 2007, 169));
    }};

    @GetMapping("/json")
    public List<Movie> getMoviesJson() {
        return movies;
    }

    @GetMapping("/html")
    public String getMoviesHtml() {
        String movieList = "<ul>";
        for (Movie movie : movies) {
            movieList += "<li>" + movie + "</li>";
        }
        movieList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Movies</h1>
                        <ul>
                """ +
               movieList +
               """
                       </ul>
                   </body>
               """;
    }

}