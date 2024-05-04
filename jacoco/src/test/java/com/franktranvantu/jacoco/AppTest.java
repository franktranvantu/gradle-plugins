package com.franktranvantu.jacoco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    private static App underTest;

    @BeforeEach
    protected void setUp() {
        underTest = new App();
    }

    @Test
    public void givenNull_whenSayHello_thenCorrect() {
        final var message = underTest.sayHello(null);
        assertThat(message).isEqualTo("Hello anonymous");
    }

    @Test
    public void givenName_whenSayHello_thenCorrect() {
        final var message = underTest.sayHello("Frank");
        assertThat(message).isEqualTo("Hello Frank");
    }
}
