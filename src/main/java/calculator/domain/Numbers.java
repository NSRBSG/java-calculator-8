package calculator.domain;


import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private final List<Integer> values;

    public Numbers(String[] stringNumbers) {
        List<Integer> numbers = new ArrayList<>();

        for (String stringNumber : stringNumbers) {
            int number = Integer.parseInt(stringNumber);

            numbers.add(number);
        }

        this.values = numbers;
    }

    public int sum() {
        return values.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
