package com.dev.spring_boot_basics_3.repository;

import com.dev.spring_boot_basics_3.model.Content;
import org.springframework.data.repository.ListCrudRepository;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {
}
