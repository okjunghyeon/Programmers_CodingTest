package lv1.나누어_떨어지는_숫자_배열;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] sorted = Arrays.stream(arr)
                .filter(e -> e % divisor == 0)
                .sorted().toArray();

        return sorted.length != 0 ? sorted : new int[]{-1};
    }
}