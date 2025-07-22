package lv1.약수의합;

import java.util.stream.LongStream;

public class Solution {
    public int solution(int n) {
        return (int) LongStream.rangeClosed(1, n / 2).filter(num -> n % num == 0).sum() + n;
    }
}