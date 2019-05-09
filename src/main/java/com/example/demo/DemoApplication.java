package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.ZonedDateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

  /**
   * Main.
   * 
   * @param args args
   */
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);

    Person person = new Person("Bob", "Hoskins", ZonedDateTime.now().toLocalDate());

    ObjectMapper objectMapper = new ObjectMapper();
    try {
      
      System.out.println(objectMapper.writeValueAsString(person));

    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    
  }

}