package com.epam.javacore.homework.hw4.task4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CollectionsOfFilms implements Serializable {
    private List<Film> filmList = new ArrayList<>();

    boolean addFilm(Film film){
    return filmList.add(film);
    }
     boolean removeFilm(Film film){
        return filmList.remove(film);
     }

}
