package calculator.domain;


public class Parser {
    public String[] parse(String text) {
        return text.split("[,:]");
    }
}
