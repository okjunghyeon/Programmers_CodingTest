package lv1.내적;

import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length)
                .map(e -> a[e] * b[e])
                .sum();
    }
}