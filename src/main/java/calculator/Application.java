package calculator;

import calculator.domain.StringCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        StringCalculator stringCalculator = new StringCalculator();

        String input = inputView.readInput();

        try {
            int result = stringCalculator.add(input);
            outputView.printResult(result);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
    }
}
