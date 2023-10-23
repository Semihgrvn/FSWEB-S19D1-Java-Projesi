package com.workintech.movieactor.movieactor.dto;

import com.workintech.movieactor.movieactor.entity.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class ActorResponse {

    private int actorId;
    private String actorFirstName;
    private String actorLastName;
    private LocalDate actorBirthDate;

}
