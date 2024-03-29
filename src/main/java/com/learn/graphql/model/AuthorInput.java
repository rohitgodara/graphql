package com.learn.graphql.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthorInput {
    private String firstName;
    private String lastName;
}
