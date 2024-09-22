package com.example.refactoring.replace_loop_with_pipeline;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BeforeReplaceLoopWithPipelineTest {

    @ParameterizedTest
    @MethodSource("provideAuthorArguments")
    void twitterHandlesBeforeReplaceLoopWithPipeline(List<Author> authors, String company, List<String> expected) {
        var result = BeforeReplaceLoopWithPipeline.twitterHandles(authors, company);

        assertThat(result).containsExactlyElementsOf(expected);
    }

    public static Stream<Arguments> provideAuthorArguments() {
        return Stream.of(
            Arguments.of(
                List.of(
                    new Author("Google", "google"),
                    new Author("Google", null),
                    new Author("Facebook", "facebook"),
                    new Author("Facebook", null)
                ),
                "Google",
                List.of("google")
            )
        );
    }
}