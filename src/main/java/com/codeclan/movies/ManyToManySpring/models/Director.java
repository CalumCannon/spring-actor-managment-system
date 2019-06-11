package com.codeclan.movies.ManyToManySpring.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "directors")
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    //@JsonIgnoreProperties("???")
    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    private List<Film> films;

    public Director(String name) {
        this.name = name;

    }

    public Director(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
