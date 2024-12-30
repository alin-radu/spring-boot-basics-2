package com.dev.spring_boot_basics_3.model;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

public record Content(
        Integer id,

        @NotBlank
        String title,

        @NotBlank
        String desc,

        Status status,
        Type contentType,
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
