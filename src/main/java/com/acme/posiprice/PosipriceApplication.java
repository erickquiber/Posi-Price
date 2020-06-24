package com.acme.posiprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PosipriceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PosipriceApplication.class, args);
    }

}
