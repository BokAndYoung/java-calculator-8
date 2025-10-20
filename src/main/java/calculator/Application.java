package calculator;

import calculator.carculate.DelimiterParser;
import calculator.carculate.NumberParser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {

        DelimiterParser delimiterParser = new DelimiterParser();
        NumberParser numberParser = new NumberParser();
        StringCalculator calculator = new StringCalculator(delimiterParser, numberParser);
        String input = InputView.readInput();
        int result = calculator.calculate(input);
        OutputView.printResult(result);
    }
}
