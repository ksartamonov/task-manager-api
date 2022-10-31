package org.kartamonov.task_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // marks main method
public class Application {
    public static void main(String[] args) {
        SpringApplication
                .run(Application.class, args);
    }
}
