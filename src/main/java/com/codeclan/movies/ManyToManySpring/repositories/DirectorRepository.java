package com.codeclan.movies.ManyToManySpring.repositories;

import com.codeclan.movies.ManyToManySpring.models.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface DirectorRepository extends JpaRepository<Director,Long> {
}
