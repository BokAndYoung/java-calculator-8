package calculator;

import calculator.carculate.DelimiterParser;
import calculator.carculate.NumberParser;
import calculator.carculate.ParsedInput;

public class StringCalculator {
    private final DelimiterParser delimiterParser;
    private final NumberParser numberParser;

    public StringCalculator(DelimiterParser delimiterParser, NumberParser numberParser) {
        this.delimiterParser = delimiterParser;
        this.numberParser = numberParser;
    }

    public int calculate(String input) {
        if (input == null || input.isEmpty()) return 0;

        ParsedInput parsed = delimiterParser.parse(input);
        int[] numbers = numberParser.parse(parsed.getNumbers(), parsed.getDelimiter());

        int sum = 0;
        for (int n : numbers) sum += n;
        return sum;
    }
}
