package com.example.demo.dao.daoimpl;

import com.example.demo.dao.MovieDAO;

import com.example.demo.entity.Movie;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDAOimpl implements MovieDAO {

    private final EntityManager theManager;
    @Autowired
    public  MovieDAOimpl(EntityManager theManager){
        this.theManager=theManager;
    }
    @Override
    @Transactional
    public void saveMovie(Movie theMovie) {
        theManager.persist(theMovie);
    }


}
