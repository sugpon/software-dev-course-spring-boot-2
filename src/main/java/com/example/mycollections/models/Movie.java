package com.example.mycollections.models;

public class Movie extends LibraryItem {
    private String director;
    private int runTime;

    public Movie(String name, String director, int year, int runTime) {
        super(name, year);
        this.director = director;
        this.runTime = runTime;
    }

    public String getDirector() {
        return director;
    }

    public void setAuthor(String author) {
        this.director = director;
    }

    public int getrRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    @Override
    public String toString() {
        return getName() + " directed by " + director + " (" + getYear() + ", " + runTime + " mins)";
    }
}
