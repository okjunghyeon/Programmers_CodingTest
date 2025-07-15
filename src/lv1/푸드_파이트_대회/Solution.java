package lv1.푸드_파이트_대회;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * food	        result
 * [1, 3, 4, 6]	"1223330333221"
 * [1, 7, 1, 2]	"111303111"
 * */
class Solution {
    public String solution(int[] food) {
        // 1,2,3 ... index의 값을 /2 하여 정수값으로 변환한다.
        // 1번부터 순서대로 변환된 정수 값 개수만큼 나열하여 문자열로 만든다. -> 111334
        // reverse 한 값을 구한다. -> 433111
        // return 원래문자 + "0" + 뒤집은 문자


        String left = IntStream.range(1, food.length)
                .mapToObj(e -> String.valueOf(e).repeat(food[e] / 2))
                .collect(Collectors.joining());

        StringBuilder sb = new StringBuilder(left);
        String right = sb.reverse().toString();

        sb.setLength(0);

        return sb.append(left).append("0").append(right).toString();
    }
}