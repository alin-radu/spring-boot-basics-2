package com.dev.spring_boot_basics_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
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