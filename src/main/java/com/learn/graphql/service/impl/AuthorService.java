package com.learn.graphql.service.impl;

import com.learn.graphql.entity.Author;
import com.learn.graphql.entity.Book;
import com.learn.graphql.model.AuthorInput;
import com.learn.graphql.repository.AuthorRepository;
import com.learn.graphql.repository.BookRepository;
import com.learn.graphql.service.IAuthorService;
import com.learn.graphql.util.GenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

import static com.learn.graphql.util.AppConstants.AUTHOR_URN_BASE;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    public AuthorRepository repository;
    public Author addAuthor(AuthorInput authorInput){
        Author author = Author.builder().id(GenUtil.generateUrnWithPrefix(AUTHOR_URN_BASE)).firstName(authorInput.getFirstName()).lastName(authorInput.getLastName()).build();
        return repository.save(author);
    }

    public Author getById(String id) {
        Optional<Author> author = repository.findById(id);
        return author.orElseThrow(() -> new HttpClientErrorException(HttpStatus.NOT_FOUND, "Not Found"));
    }
}
