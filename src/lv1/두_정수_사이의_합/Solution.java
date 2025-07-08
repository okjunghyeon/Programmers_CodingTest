package lv1.두_정수_사이의_합;

import java.util.stream.IntStream;

public class Solution {
    public long solution(int a, int b) {
        return IntStream
                .rangeClosed(Math.min(a,b),Math.max(a,b))
                .sum();
    }
}