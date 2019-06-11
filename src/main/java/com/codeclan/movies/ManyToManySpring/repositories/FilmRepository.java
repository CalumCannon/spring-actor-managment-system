package com.codeclan.movies.ManyToManySpring.repositories;

import com.codeclan.movies.ManyToManySpring.models.Director;
import com.codeclan.movies.ManyToManySpring.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film,Long> {

}
