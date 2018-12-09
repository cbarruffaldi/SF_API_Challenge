package com.ibm.challenge.beans;

/*
This class represents the only data that should have the service:
Title and Location as it is specified in the exercise
It is used for the API Responses.
 */
public class FilmResponse {

    String title;

    String location;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FilmResponse(String title, String location) {
        this.title = title;
        this.location = location;
    }

}
