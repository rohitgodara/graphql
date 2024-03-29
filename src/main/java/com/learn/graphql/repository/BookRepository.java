package com.learn.graphql.repository;

import com.learn.graphql.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends MongoRepository<Book, String> {
}
