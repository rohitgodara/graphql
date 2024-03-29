package com.learn.graphql.service;

import com.learn.graphql.entity.Author;
import com.learn.graphql.model.AuthorInput;

public interface IAuthorService {
    Author getById(String id);

    Author addAuthor(AuthorInput authorInput);
}
