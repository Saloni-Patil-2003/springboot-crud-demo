package com.example.demo.dao.daoimpl;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Scanner;

@Repository
public class EmployeeDAOimpl implements EmployeeDAO {

    private final EntityManager theManager;

    @Autowired
    public  EmployeeDAOimpl(EntityManager theManager){
        this.theManager=theManager;
    }
    @Override
    @Transactional
    public void save(Employee theEmployee) {
        theManager.persist(theEmployee);

    }

    @Override
    public Employee findById(int id) {
        return theManager.find(Employee.class,id);
    }

    @Override
    public Employee findByPhono(long phono) {
        try {
            Query query = theManager.createQuery("select e from Employee e where phoneNo=:phono");
            query.setParameter("phono", phono);
            return (Employee) query.getSingleResult();
        } catch (NoResultException e) {
            return  null;
        }



    }

    @Override
    public List<Employee> fetchAll() {
        Query query= theManager.createQuery("Select e from Employee e");
        return  query.getResultList();
    }
    @Transactional
    @Override


    public  void  update(int theid){
        Scanner sc=new Scanner(System.in);
        Employee foundemployee=theManager.find(Employee.class,theid);
        if(foundemployee==null){
            System.out.println("no such employee");
        }
        else {
            System.out.println("Enter the employeee new salary:");
            foundemployee.setSalary(sc.nextDouble());
        }

    }
@Transactional
    @Override
    public void delete(int id) {
        Employee found=theManager.find(Employee.class,id);
        if(found==null){
            System.out.println("No Such type of Employee ");

        }
        else {
            theManager.remove(found);
            System.out.println("Remove successfully with id");
        }


    }
}
