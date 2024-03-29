package com.learn.graphql.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
@Builder
public class Author {

    @Id
    private String id;
    private String firstName;
    private String lastName;

}
