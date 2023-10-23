package com.workintech.movieactor.movieactor.util;

import com.workintech.movieactor.movieactor.dto.MovieActorResponse;
import com.workintech.movieactor.movieactor.dto.MovieResponse;
import com.workintech.movieactor.movieactor.entity.Actor;
import com.workintech.movieactor.movieactor.entity.Movie;

public class HollywoodUtility {

    public static MovieActorResponse convertMovieActorResponse(Movie movie, Actor actor){
        return new MovieActorResponse(movie, actor.getId(), actor.getFirstName(),
                actor.getLastName(), actor.getBirthDate());
    }


}
