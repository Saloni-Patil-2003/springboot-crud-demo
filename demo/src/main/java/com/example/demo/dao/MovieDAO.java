package com.example.demo.dao;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Movie;
import jakarta.transaction.Transactional;

public interface MovieDAO {



    public void saveMovie(Movie theEmployee);
}
