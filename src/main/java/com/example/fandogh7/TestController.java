package com.example.fandogh7;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity test() {
        System.out.println("Requested.....");
        return new ResponseEntity("Hello Form Esfarvarin", HttpStatus.ACCEPTED);
    }
}
