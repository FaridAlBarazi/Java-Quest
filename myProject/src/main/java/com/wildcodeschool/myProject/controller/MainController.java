package com.wildcodeschool.myProject.controller;

import com.wildcodeschool.myProject.beans.Person;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class MainController {
    @GetMapping("/greetings")
    @ResponseBody
    public String index() {
//        return "Greetings from Spring Boot!";
        return "Greetings from <a href='https://spring.io/projects/spring-boot'>Spring Boot!</a>";


    }
    @GetMapping("/person")
    @ResponseBody
    public Person personSample() {

        return new Person("John Doe", 30);
    }

    @GetMapping("/login")
    public String signIn() {

        return "sign-in.html";
    }
}
