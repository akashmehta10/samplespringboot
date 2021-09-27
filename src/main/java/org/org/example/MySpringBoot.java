package org.org.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class MySpringBoot {
    Logger logger = LoggerFactory.getLogger(MySpringBoot.class);
    @RequestMapping("/")
    public String home() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "Hello Boss!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MySpringBoot.class, args);
    }
}

