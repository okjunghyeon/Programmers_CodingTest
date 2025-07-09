package lv1.하샤드_수;

import java.util.Arrays;

public class Solution {
    public boolean solution(int x) {
        // 자릿수 더한 값 구하기
        String[] arr = String.valueOf(x).split("");
        int sum = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();

        // x가 더한 값으로 나누어 떨어지는지 확인하기
        return x % sum == 0;
    }
}