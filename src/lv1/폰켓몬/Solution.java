package lv1.폰켓몬;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        // 중복 포켓몬 제거
        Set<Integer> set = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        return Math.min(set.size(), nums.length / 2);
    }
}