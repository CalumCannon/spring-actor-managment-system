package com.codeclan.movies.ManyToManySpring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/directors")
public class DirectorController {

    @Autowired
    DirectorController directorController;

}
