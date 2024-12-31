package com.dev.spring_boot_basics_3;

import com.dev.spring_boot_basics_3.model.Content;
import com.dev.spring_boot_basics_3.model.Status;
import com.dev.spring_boot_basics_3.model.Type;
import com.dev.spring_boot_basics_3.repository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ContentRepository repository) {
        return args -> {
            System.out.println("You could insert some data in the DB. | Application");

            Content content = new Content(
                    null,
                    "My Blog Post",
                    "My First blog post executed from CommandLineRunner",
                    Status.IDEA,
                    Type.ARTICLE,
                    LocalDateTime.now(),
                    null,
                    "");

            repository.save(content);

        };
    }

}

//public static void main(String[] args) {
//    ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
//
//    AtomicInteger count = new AtomicInteger(1);
//    Arrays.stream(context.getBeanDefinitionNames()).forEach((item) -> {
//        System.out.println(count + ". " + item);
//        count.getAndIncrement();
//    });
//}