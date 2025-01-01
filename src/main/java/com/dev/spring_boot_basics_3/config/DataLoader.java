package com.dev.spring_boot_basics_3.config;

import com.dev.spring_boot_basics_3.model.Content;
import com.dev.spring_boot_basics_3.model.Status;
import com.dev.spring_boot_basics_3.model.Type;
import com.dev.spring_boot_basics_3.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {
    private final ContentRepository repository;

    public DataLoader(ContentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("You could insert some data in the DB. | DataLoader");

        Content content = new Content(
                null,
                "My Blog Post, from DataLoader",
                "My First blog post executed from DataLoader",
                Status.COMPLETED,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");

        repository.save(content);

    }
}
