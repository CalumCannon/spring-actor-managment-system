package com.codeclan.movies.ManyToManySpring.repositories;

import com.codeclan.movies.ManyToManySpring.models.Director;
import com.codeclan.movies.ManyToManySpring.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface FilmRepository extends JpaRepository<Film,Long> {

    public List<Film> getFilmsByDirectorId(Long id);

}
