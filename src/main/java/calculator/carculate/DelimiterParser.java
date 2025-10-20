package calculator.carculate;

import java.util.regex.Pattern;

public class DelimiterParser {
    private static final String CUSTOM_DELIMITER_PREFIX = "//";

    public ParsedInput parse(String input) {
        String delimiter = "[,:]";
        String numbers = input;

        if (input.startsWith(CUSTOM_DELIMITER_PREFIX)) {
            int newlineIndex = input.indexOf('\n');
            if (newlineIndex == -1) throw new IllegalArgumentException("잘못된 커스텀 구분자 형식");

            delimiter = Pattern.quote(input.substring(2, newlineIndex));
            numbers = input.substring(newlineIndex + 1);
        }

        return new ParsedInput(numbers, delimiter);
    }
}