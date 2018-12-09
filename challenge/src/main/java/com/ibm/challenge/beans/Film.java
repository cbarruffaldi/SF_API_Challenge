package com.ibm.challenge.beans;

import java.util.List;

/*
General class for a Film. In the future this service may provide full description of the movies.
 */
public class Film {

    String title;

    List<String> locations;

    String actor1;

    String actor2;

    String actor3;

    String year;

    String funFacts;

    String productionCompany;

    String Distributor;

    String writer;

    String director;

    /*
    For this exercise purpose, a Film is created from a title and a location
     */
    public Film(String title, List<String> locations) {
        this.title = title;
        this.locations = locations;
    }

    public Film(String title, List<String> locations, String actor1, String actor2, String actor3,
                String year, String funFacts, String productionCompany, String distributor,
                String writer, String director) {
        this.title = title;
        this.locations = locations;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
        this.year = year;
        this.funFacts = funFacts;
        this.productionCompany = productionCompany;
        Distributor = distributor;
        this.writer = writer;
        this.director = director;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public String getActor3() {
        return actor3;
    }

    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFunFacts() {
        return funFacts;
    }

    public void setFunFacts(String funFacts) {
        this.funFacts = funFacts;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getDistributor() {
        return Distributor;
    }

    public void setDistributor(String distributor) {
        Distributor = distributor;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
