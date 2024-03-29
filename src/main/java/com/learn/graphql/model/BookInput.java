package com.learn.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookInput {
    private String name;
    private int pageCount;
    private String authorId;
}
