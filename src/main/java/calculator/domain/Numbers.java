package calculator.domain;


import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private final List<Integer> values;

    public Numbers(String[] stringNumbers) {
        List<Integer> numbers = new ArrayList<>();

        for (String stringNumber : stringNumbers) {
            validateIsInteger(stringNumber);
            int number = Integer.parseInt(stringNumber);
            validateIsNegativeInteger(number);

            numbers.add(number);
        }

        this.values = numbers;
    }

    public int sum() {
        return values.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    private void validateIsInteger(String stringNumber) {
        try {
            Integer.parseInt(stringNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    private void validateIsNegativeInteger(Integer number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
    }
}
