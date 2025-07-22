package lv1.최대공약수와_최소공배수;

class Solution {
    public int[] solution(int n, int m) {

        // 유클리드 호제법을 사용하여 최대공약수와 최소공배수를 구하는 방법
        int a = Math.max(n, m);
        int b = Math.min(n, m);

        while(b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        int gcd = a; // 최대공약수 greatest common divisor
        int lcm = n * m / gcd; // 최소공배수 least common multiple

        return new int[]{gcd, lcm};
    }
}
