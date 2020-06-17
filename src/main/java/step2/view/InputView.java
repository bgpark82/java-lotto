package step2.view;

import step2.Lotto;
import step2.Money;
import step2.Number;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static Money insert(){
        print("구입금액을 입력해주세요");
        return Money.buy(scanner.nextInt());
    }

    public static Lotto getWinLotto(){
        print("지난 주 당첨 번호를 입력해주세요");
        Set<Number> numbers = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            numbers.add(Number.win(scanner.nextInt()));
        }
        return Lotto.win(numbers);
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
