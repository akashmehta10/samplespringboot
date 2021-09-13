package org.org.example;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class MySpringBoot {

    @RequestMapping("/")
    public String home() {
        return "Hello Boss!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MySpringBoot.class, args);
    }

}
