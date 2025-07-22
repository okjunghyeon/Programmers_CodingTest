package lv1.소수_찾기;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(2, n).filter(this::isPrimeNumber).count();
    }

    boolean isPrimeNumber(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}