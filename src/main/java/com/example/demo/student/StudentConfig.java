package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.util.Calendar.JANUARY;

@Configuration
public class StudentConfig {

  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student mariam = new Student(
          "Mariam",
          "mariam.jamal@newmail.net",
          LocalDate.of(2000, JANUARY, 5)
      );

      Student alex = new Student(
          "Alex",
          "Alex.jamal@newmail.net",
          LocalDate.of(2001, JANUARY, 10)
      );

      repository.save(mariam);
      repository.save(alex);

//      repository.saveAll(
//          List.of(mariam, alex)
//      );
    };
  }
}
