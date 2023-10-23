package com.workintech.movieactor.movieactor.service;


import com.workintech.movieactor.movieactor.entity.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findAll();
    Actor findById(int id);
    Actor save(Actor actor);
    Actor delete(int id);

}
