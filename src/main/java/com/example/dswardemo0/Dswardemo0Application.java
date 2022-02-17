package com.example.dswardemo0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dswardemo0Application {

    @GetMapping("/home")
    public String home(){
        return "running";
    }
    public static void main(String[] args) {
        SpringApplication.run(Dswardemo0Application.class, args);
    }

}
