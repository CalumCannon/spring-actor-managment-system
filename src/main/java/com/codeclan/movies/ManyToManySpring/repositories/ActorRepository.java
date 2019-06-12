package com.codeclan.movies.ManyToManySpring.repositories;

import com.codeclan.movies.ManyToManySpring.models.Actor;
import com.codeclan.movies.ManyToManySpring.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ActorRepository extends JpaRepository<Actor,Long> {
}
