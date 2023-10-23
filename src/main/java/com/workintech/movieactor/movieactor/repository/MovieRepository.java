package com.workintech.movieactor.movieactor.repository;

import com.workintech.movieactor.movieactor.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
