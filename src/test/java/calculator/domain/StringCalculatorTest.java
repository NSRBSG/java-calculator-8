package calculator.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
    @Test
    void addEmptyString() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("");

        assertThat(result).isEqualTo(0);
    }

    @Test
    void addOneString() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("7");

        assertThat(result).isEqualTo(7);
    }

    @Test
    void addWithComma() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("1,2");

        assertThat(result).isEqualTo(3);
    }

    @Test
    void addWithMultipleCommas() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("1,2,3,4,5");

        assertThat(result).isEqualTo(15);
    }

    @Test
    void addWithCommaColon() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("1,2:3");

        assertThat(result).isEqualTo(6);
    }
}