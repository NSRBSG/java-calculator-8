package calculator.domain;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.)\n(.*)");

    public String[] parse(String text) {
        Matcher matcher = CUSTOM_DELIMITER_PATTERN.matcher(text);

        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            String stringNumbers = matcher.group(2);

            return stringNumbers.split(Pattern.quote(customDelimiter));
        }

        return text.split("[,:]");
    }
}
