package main.java.com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to My Java Web App!</h1>" +
               "<p>This app is running on a Docker container on Ubuntu LTS.</p>" +
               "<p>Server time: " + java.time.LocalDateTime.now() + "</p>";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}