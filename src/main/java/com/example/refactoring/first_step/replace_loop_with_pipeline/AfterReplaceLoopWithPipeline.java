package com.example.refactoring.first_step.replace_loop_with_pipeline;

import java.util.List;
import java.util.Objects;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class AfterReplaceLoopWithPipeline {
    public static List<String> twitterHandles(List<Author> authors, String company) {
        return authors.stream()
            .filter(author -> author.getCompany().equals(company))
            .map(Author::getTwitterHandle)
            .filter(Objects::nonNull)
            .toList();
    }
}
