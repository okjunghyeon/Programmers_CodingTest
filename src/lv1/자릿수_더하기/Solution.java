package lv1.자릿수_더하기;

import java.util.Arrays;
/**
 * 자릿수 더하기
 * 숫자를 입력받으면 각 자리수의 합을 구한다.
 * 예를 들어 1234를 입력받으면 1 + 2 + 3 + 4 = 10이 된다.
 */
public class Solution {
    public int solution(int n) {
        String[] arr = String.valueOf(n).split("");
        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}