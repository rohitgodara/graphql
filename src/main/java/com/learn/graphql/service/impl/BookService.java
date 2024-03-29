package com.learn.graphql.service.impl;

import com.learn.graphql.entity.Book;
import com.learn.graphql.model.BookInput;
import com.learn.graphql.repository.BookRepository;
import com.learn.graphql.service.IBookService;
import com.learn.graphql.util.GenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

import static com.learn.graphql.util.AppConstants.AUTHOR_URN_BASE;
import static com.learn.graphql.util.AppConstants.BOOK_URN_BASE;

@Repository
public class BookService implements IBookService {
    @Autowired
    public BookRepository repository;

    public Book addBook(BookInput bookInput){
        Book book = Book.builder().id(GenUtil.generateUrnWithPrefix(BOOK_URN_BASE)).name(bookInput.getName()).pageCount(bookInput.getPageCount()).authorId(bookInput.getAuthorId()).build();
        return repository.save(book);
    }
    public Book getById(String id) {
        Optional<Book> book = repository.findById(id);
        return book.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND, "Not Found"));
    }

}
