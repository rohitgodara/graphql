package com.learn.graphql.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Arrays;
import java.util.List;

@Data
@Builder
public class Book{

    @Id
    private String id;
    private String name;
    private int pageCount;
    private String authorId;

}
