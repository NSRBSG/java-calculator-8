package calculator.domain;

public class StringCalculator {
    public int add(String text) {
        if (text == null) {
            throw new IllegalArgumentException();
        }

        if (text.isEmpty()) {
            return 0;
        }

        Parser parser = new Parser();
        Numbers numbers = new Numbers(parser.parse(text));

        return numbers.sum();
    }
}
