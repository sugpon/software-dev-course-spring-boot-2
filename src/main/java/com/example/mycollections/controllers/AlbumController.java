package com.example.mycollections.controllers;

import com.example.mycollections.models.Album;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    private final List<Album> albums = new ArrayList<>() {{
        add(new Album("Title", "Meghan Trainor", 2015, 15));
        add(new Album("Thank You", "Meghan Trainor", 2016, 15));
        add(new Album("Treat Myself", "Meghan Trainor", 2020, 15));
    }};

    @GetMapping("/json")
    public List<Album> getAlbumJson() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {
        String albumList = "<ul>";
        for (Album album : albums) {
            albumList += "<li>" + album + "</li>";
        }
        albumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Albums</h1>
                        <ul>
                """ +
               albumList +
               """
                       </ul>
                   </body>
               """;
    }

}