package com.example.refactoring.replace_loop_with_pipeline;

import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class BeforeReplaceLoopWithPipeline {
    public static List<String> twitterHandles(List<Author> authors, String company) {
        var result = new ArrayList<String>();

        for (Author author : authors) {
            if (author.getCompany().equals(company)) {
                var twitterHandle = author.getTwitterHandle();

                if (twitterHandle != null) {
                    result.add(twitterHandle);
                }
            }
        }

        return result;
    }
}
