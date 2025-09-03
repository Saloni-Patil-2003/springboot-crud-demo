package com.example.demo;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.dao.MovieDAO;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Movie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;



@SpringBootApplication
public class DemoApplication {



    @Bean
    public CommandLineRunner commandlinerunner(EmployeeDAO theEmployee){
      return runner ->{
          Scanner sc=new Scanner(System.in);

          for (int i = 0; ; i++) {


              System.out.println("1.save data");
              System.out.println("2.fetch the data using id");
              System.out.println("3.fetch the data using phono");
              System.out.println("4.fetch the All data from database");
              System.out.println("5.Update the data");
              System.out.println("6.delete the data");
              System.out.println("enter the Number what you want:");
              int num = sc.nextInt();
              switch (num) {
                  case 1: {
                      System.out.println("Enter the First Name");
                      String firstname = sc.next();
                      System.out.println("Enter the Last Name");
                      String lastName = sc.next();
                      System.out.println("Enter the Designation");
                      String desig = sc.next();
                      sc.nextLine();
                      System.out.println("Enter the contact no");
                      long contact = sc.nextLong();
                      System.out.println("Enter the Salary");
                      double sal = sc.nextDouble();


                      theEmployee.save(new Employee(firstname, lastName, contact, desig, sal));
                      break;
                  }

                  case 2: {
                      System.out.println("Enter the id:");
                      int id = sc.nextInt();
                      Employee foundEMp = theEmployee.findById(id);
                      if (foundEMp == null) {
                          System.out.println("No employee present in the database");
                      } else {
                          System.out.println(foundEMp);
                      }
                      break;

                  }
                  case 3: {
                      System.out.println("Enter phono: ");
                      long phono = sc.nextLong();
                      Employee found = theEmployee.findByPhono(phono);
                      if (found != null) {
                          System.out.println(found);
                      } else {
                          System.out.println("No such type Of Phono ");
                      }

                      break;

                  }
                  case 4:{
                      List<Employee> e = theEmployee.fetchAll();
                      for (Employee e2 : e) {
                          System.out.println(e2);

                      }break;
                  }

                  case 5: {

                      System.out.println("Enter the the id");
                      theEmployee.update(sc.nextInt());

                      break;

                  }
                  case 6: {
                      System.out.println("Enter the id:");
                      int id = sc.nextInt();
                      theEmployee.delete(id);
                      break;
                  }

                  default: {
                      System.out.println(" enter the option 1 to 5");
                  }


              }
          }












         //  int num=sc.nextInt();
           //for (int i = 0; i < num; i++) {
             //System.out.println("enter the Movie Name:");
               //String name = sc.next();


              //theMovieDAO.saveMovie(new Movie(name));
           //}
     //System.out.println("Save successfully");

      };



    }
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

}
