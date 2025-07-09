package lv1.정수_제곱근_판별;

public class Solution {
    public long solution(long n) {
        // n의 제곱근을 구함
        double sqrt = Math.sqrt(n);

        // 제곱근이 정수가 아니면 -1을 반환
        // 제곱근이 정수이면, 그 다음 정수의 제곱을 반환
        return sqrt != (int) sqrt ? -1 : (long) Math.pow(sqrt + 1, 2);
    }
}