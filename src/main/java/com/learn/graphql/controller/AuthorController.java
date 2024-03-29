package com.learn.graphql.controller;

import com.learn.graphql.entity.Author;
import com.learn.graphql.entity.Book;
import com.learn.graphql.model.AuthorInput;
import com.learn.graphql.model.BookInput;
import com.learn.graphql.service.IAuthorService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class AuthorController {

    @Autowired
    IAuthorService authorService;

    @MutationMapping
    public Author addAuthor(@Argument AuthorInput authorInput) {
        return authorService.addAuthor(authorInput);
    }

    @QueryMapping
    public Author authorById(@Argument String id) {
        return authorService.getById(id);
    }

}
