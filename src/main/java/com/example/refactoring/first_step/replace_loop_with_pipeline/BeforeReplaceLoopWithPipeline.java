package com.example.refactoring.first_step.replace_loop_with_pipeline;

import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;
/**
 * Replace Loop with Pipeline
 * <br/><br/>
 * Just try using the Stream API to replace the loop.
 */
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
