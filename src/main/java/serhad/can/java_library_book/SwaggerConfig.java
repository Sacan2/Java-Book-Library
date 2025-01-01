package serhad.can.java_library_book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SwaggerConfig {

    @PostMapping("/hello")
    public String sayHello() {
        return "Hello, Swagger!";
    }

}

