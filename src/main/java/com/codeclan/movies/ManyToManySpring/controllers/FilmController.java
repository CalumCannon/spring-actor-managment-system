package com.codeclan.movies.ManyToManySpring.controllers;

import com.codeclan.movies.ManyToManySpring.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/films")
public class FilmController {

    @Autowired
    FilmRepository filmRepository;


}
