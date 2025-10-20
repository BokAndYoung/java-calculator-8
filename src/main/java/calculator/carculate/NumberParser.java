package calculator.carculate;

public class NumberParser {
    public int[] parse(String numbers, String delimiter) {
        String[] tokens = numbers.split(delimiter);
        int[] result = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            int n = Integer.parseInt(tokens[i].trim());
            if (n < 0) throw new IllegalArgumentException("음수는 입력할 수 없습니다: " + n);
            result[i] = n;
        }

        return result;
    }
}

