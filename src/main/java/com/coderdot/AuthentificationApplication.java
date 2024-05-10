package com.coderdot;  // or com.authentification if you have changed it

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthentificationApplication { // Changed from SpringSecurityApplication
    public static void main(String[] args) {
        SpringApplication.run(AuthentificationApplication.class, args);
        System.out.println("hello");
    }
}