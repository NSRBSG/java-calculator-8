package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class NumbersTest {
    @Test
    void sum() {
        Numbers numbers = new Numbers(new String[]{"1", "2", "3"});

        int result = numbers.sum();

        assertThat(result).isEqualTo(6);
    }
}
