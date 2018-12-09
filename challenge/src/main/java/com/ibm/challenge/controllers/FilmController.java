package com.ibm.challenge.controllers;

import com.ibm.challenge.beans.Film;
import com.ibm.challenge.beans.FilmResponse;
import com.ibm.challenge.utils.JsonParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FilmController {

    /*
    List every film in the database, if location is not available it is shown too.
    If there is no location specified, the field should be an empty string.
     */
    @RequestMapping(method = RequestMethod.GET, value="/all")
    @ResponseBody
    public List<FilmResponse> getAllMovies() {
        List<Film> films = JsonParser.parse();
        List<FilmResponse> response = new ArrayList<>();

        for(Film f : films) {
            for (String location : f.getLocations()) {
                response.add(new FilmResponse(f.getTitle(), location));
            }
        }

        return response;
    }

    /*
    Filter by title
     */
    @RequestMapping(method = RequestMethod.GET, value="/film")
    @ResponseBody
    public List<FilmResponse> getMoviesByName(@RequestParam(value = "title", required = true) String title) {
        List<Film> films = JsonParser.parse();
        List<FilmResponse> response = new ArrayList<>();

        for(Film f : films) {
            if (f.getTitle().equals(title)) {
                for (String location : f.getLocations()) {
                    response.add(new FilmResponse(f.getTitle(), location));
                }
            }
        }

        return response;
    }

}
