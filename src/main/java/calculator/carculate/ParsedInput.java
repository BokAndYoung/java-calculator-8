package calculator.carculate;


public class ParsedInput {
    private final String numbers;
    private final String delimiter;

    public ParsedInput(String numbers, String delimiter) {
        this.numbers = numbers;
        this.delimiter = delimiter;
    }

    public String getNumbers() { return numbers; }
    public String getDelimiter() { return delimiter; }
}