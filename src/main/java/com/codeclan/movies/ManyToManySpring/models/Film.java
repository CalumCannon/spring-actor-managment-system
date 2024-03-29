package com.codeclan.movies.ManyToManySpring.models;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    private Director director;

    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @ManyToMany
    @Cascade(value = org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "actors_films",
            joinColumns = { @JoinColumn(
                    name = "film_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "actor_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Actor> actors;


    public Film(String title, Director director, Genre genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.actors = new ArrayList<>();
    }

    public Film(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public void addActor(Actor actor){
        this.actors.add(actor);
    }


}
