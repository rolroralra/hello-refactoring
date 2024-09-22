package com.example.refactoring.first_step.replace_loop_with_pipeline;

import lombok.Getter;

@Getter
public  class Author {
    String company;
    String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }
}
