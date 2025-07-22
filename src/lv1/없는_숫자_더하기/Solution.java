package lv1.없는_숫자_더하기;

import java.util.Arrays;

public class Solution {
    public int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}