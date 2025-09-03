package com.example.demo.entity;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "Movie_table")
public class Movie {
    @Id
    @Column(name = "mov_id")
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name ="movie_name")
    String moviename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public Movie(String moviename) {
        this.moviename = moviename;
    }
}
