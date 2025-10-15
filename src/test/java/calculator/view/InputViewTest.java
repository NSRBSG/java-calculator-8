package calculator.view;

import static org.assertj.core.api.Assertions.assertThat;

import calculator.Application;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.test.NsTest;
import java.io.ByteArrayInputStream;
import org.junit.jupiter.api.Test;

class InputViewTest extends NsTest {
    @Test
    void readInput() {
        InputView inputView = new InputView();
        String expectedInput = "1,2:3";

        System.setIn(new ByteArrayInputStream(expectedInput.getBytes()));

        String currentInput = inputView.readInput();
        Console.close();

        assertThat(output()).isEqualTo("덧셈할 문자열을 입력해 주세요.");
        assertThat(currentInput).isEqualTo(expectedInput);
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
