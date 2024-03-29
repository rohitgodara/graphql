package com.learn.graphql.controller;

import com.learn.graphql.entity.Author;
import com.learn.graphql.entity.Book;
import com.learn.graphql.model.BookInput;
import com.learn.graphql.service.IAuthorService;
import com.learn.graphql.service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class BookController {

    @Autowired
    IBookService bookService;

    @Autowired
    IAuthorService authorService;

    @MutationMapping
    public Book addBook(@Argument BookInput bookInput) {
        return bookService.addBook(bookInput);
    }

    @QueryMapping
    public Book bookById(@Argument String id) {
        log.info("id :: {}", id);
        return bookService.getById(id);
    }

    @SchemaMapping
    public Author author(Book book) {
        return authorService.getById(book.getAuthorId());
    }

}