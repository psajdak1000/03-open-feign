package com.psajdak.modul3springboothttp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Modul3springbootHttpApplication {

    public static void main(String[] args) {
        SpringApplication.run(Modul3springbootHttpApplication.class, args);
    }

}
