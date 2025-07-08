package lv1.x만큼_간격이_있는_n개의_숫자;

import java.util.stream.IntStream;

public class Solution {
    public long[] solution(int x, int n) {
        return IntStream.rangeClosed(1, n)
                .mapToLong(num -> x * num)
                .toArray();
    }
}