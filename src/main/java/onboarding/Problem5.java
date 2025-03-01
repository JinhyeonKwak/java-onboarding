package onboarding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> coinType = Arrays.asList(50000, 10000, 5000, 1000, 500, 100, 50, 10, 1);

        for (Integer coin : coinType) {
            int count = money / coin;
            answer.add(count);
            money %= coin;
        }
        return answer;
    }
}
