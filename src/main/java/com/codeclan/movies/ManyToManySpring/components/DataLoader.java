package com.codeclan.movies.ManyToManySpring.components;

import com.codeclan.movies.ManyToManySpring.models.Actor;
import com.codeclan.movies.ManyToManySpring.models.Director;
import com.codeclan.movies.ManyToManySpring.models.Film;
import com.codeclan.movies.ManyToManySpring.models.Genre;
import com.codeclan.movies.ManyToManySpring.repositories.ActorRepository;
import com.codeclan.movies.ManyToManySpring.repositories.DirectorRepository;
import com.codeclan.movies.ManyToManySpring.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FilmRepository filmRepository;

    @Autowired
    DirectorRepository directorRepository;

    @Autowired
    ActorRepository actorRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Director director = new Director("Director Man");
        directorRepository.save(director);

        Film film = new Film("Film Movie", director, Genre.SciFi);
        filmRepository.save(film);

        Actor actor = new Actor("Calum");
        actor.addFilm(film);
        actorRepository.save(actor);

        /*
        jack.addRaid(raid1);
        jack.addRaid(raid2);
        pirateRepository.save(jack);

        raid2.addPirate(john);
        raidRepository.save(raid2);
        */


    }
}