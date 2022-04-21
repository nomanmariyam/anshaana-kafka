package com.anhaana.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.anshaana")
public class AnshannaKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnshannaKafkaApplication.class, args);
    }

}
