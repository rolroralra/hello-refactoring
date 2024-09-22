package com.example.refactoring.replace_loop_with_pipeline;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class AfterReplaceLoopWithPipelineTest {
    @ParameterizedTest
    @MethodSource("com.example.refactoring.replace_loop_with_pipeline.BeforeReplaceLoopWithPipelineTest#provideAuthorArguments")
    void twitterHandlesAfterReplaceLoopWithPipeline(List<Author> authors, String company, List<String> expected) {
        var result = AfterReplaceLoopWithPipeline.twitterHandles(authors, company);

        assertThat(result).containsExactlyElementsOf(expected);
    }
}