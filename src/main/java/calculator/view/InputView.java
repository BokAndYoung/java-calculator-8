package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String CUSTOM_DELIMITER_PREFIX = "//";


    public static String readInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();



        //TODO "//"로시작되는 입력은 따로 처리해야합니다.

        if (input.startsWith(CUSTOM_DELIMITER_PREFIX)) {
            String numbers = Console.readLine();
            return input + "\n" + numbers;
        }

        return input;
    }
}