package com.codeclan.movies.ManyToManySpring.repositories;

import com.codeclan.movies.ManyToManySpring.models.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director,Long> {
}
