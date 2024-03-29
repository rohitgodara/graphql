package com.learn.graphql.util;

import java.util.UUID;

public class GenUtil {
    public static String generateUrnWithPrefix(String prefix) {
        return prefix + UUID.randomUUID().toString();
    }
}
