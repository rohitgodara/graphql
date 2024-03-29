package com.learn.graphql;

import com.learn.graphql.entity.Author;
import com.learn.graphql.model.AuthorInput;
import com.learn.graphql.service.IAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);

	}

}
