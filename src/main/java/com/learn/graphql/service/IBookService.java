package com.learn.graphql.service;

import com.learn.graphql.entity.Book;
import com.learn.graphql.model.BookInput;

public interface IBookService {
    Book getById(String id);

    Book addBook(BookInput bookInput);
}
