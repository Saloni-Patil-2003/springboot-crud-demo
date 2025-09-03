package com.example.demo.dao;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public  void save(Employee theEmployee);
    public Employee findById(int id);
    public  Employee findByPhono(long phono);
    public List<Employee> fetchAll();
    public  void update(int id);

    public void  delete(int id);
}
