package com.workintech.movieactor.movieactor.service;

import com.workintech.movieactor.movieactor.entity.Actor;
import com.workintech.movieactor.movieactor.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();
    Movie findById(int id);
    Movie save(Movie movie);
    Movie delete(int id);


}


