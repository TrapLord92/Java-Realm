package com.traplord.oop.superkeyword06;

public class Movie extends Video{
    String director;
    String rating;

    public Movie(String title, int lenght, String director, String rating) {
        super(title, lenght);
        this.director = director;
        this.rating = rating;
    }
}
