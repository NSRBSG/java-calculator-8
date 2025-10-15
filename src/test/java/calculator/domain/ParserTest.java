package calculator.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class ParserTest {
    @Test
    void parseWithDefaultDelimiters() {
        Parser parser = new Parser();

        String[] currentNumbers = parser.parse("1,2:3");

        String[] expectedNumbers = {"1", "2", "3"};

        assertThat(currentNumbers).isEqualTo(expectedNumbers);
    }

    @Test
    void parseWithCustomDelimiter() {
        Parser parser = new Parser();

        String[] currentNumbers = parser.parse("//!\\n1!2!3");

        String[] expectedNumbers = {"1", "2", "3"};
        assertThat(currentNumbers).isEqualTo(expectedNumbers);
    }
}
