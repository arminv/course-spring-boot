package com.devtiro.database.repositories;

import com.devtiro.database.domain.Author;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

    // Note - Spring Data JPA can figure out how to implement this just becayse of how it is named!
    Iterable<Author> ageLessThan(int age);

}
