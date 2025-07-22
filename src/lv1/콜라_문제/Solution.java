package lv1.콜라_문제;

class Solution {
    public int solution(int a, int b, int n) {
        // n개의 콜라는 a로 나눈다  20/2 = 10
        // n 에는 n%a 만 남긴다.
        // 나눈 몫과 b를 곱하여 n에 더하고 total에도 더한다.
        // n 이 a보다 작아질때까지 반복한다.

        int total = 0;

        while(n >= a) {
            int count = n / a;
            n %= a;
            int newCoke = count * b;
            total += newCoke;
            n += newCoke;
        }

        return total;
    }
}