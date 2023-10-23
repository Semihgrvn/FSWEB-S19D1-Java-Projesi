package com.workintech.movieactor.movieactor.dto;

import com.workintech.movieactor.movieactor.entity.Actor;
import com.workintech.movieactor.movieactor.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieActorRequest {

    private Movie movie;
    private Actor actor;

}
