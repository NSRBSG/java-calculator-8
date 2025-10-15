package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class NumbersTest {
    @Test
    void sum() {
        Numbers numbers = new Numbers(new String[]{"1", "2", "3"});

        int result = numbers.sum();

        assertThat(result).isEqualTo(6);
    }

    @Test
    void throwExceptionForNegativeNumbers() {
        String[] inputs = {"1", "-2", "3"};

        assertThatThrownBy(() -> new Numbers(inputs))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void throwExceptionForNonNumericInput() {
        String[] inputs = {"1", "!", "3"};

        assertThatThrownBy(() -> new Numbers(inputs))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
