package calculator.view;

import static org.assertj.core.api.Assertions.assertThat;

import calculator.Application;
import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

class OutputViewTest extends NsTest {
    @Test
    void printResult() {
        OutputView outputView = new OutputView();

        outputView.printResult(6);

        assertThat(output()).isEqualTo("결과 : 6");
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
