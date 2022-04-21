package com.anshaana.kafka.infrastructure.entry.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("hello")
    public ResponseEntity<String> helloWorld(@RequestParam  String name) {
        return ResponseEntity.ok("Hello : " + name);
    }


}
