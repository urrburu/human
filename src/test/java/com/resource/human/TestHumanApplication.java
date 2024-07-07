package com.resource.human;

import org.springframework.boot.SpringApplication;

public class TestHumanApplication {

    public static void main(String[] args) {
        SpringApplication.from(HumanApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
