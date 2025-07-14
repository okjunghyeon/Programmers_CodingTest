package lv1._3진법_뒤집기;

class Solution {
    public int solution(int n) {
        String toThird = Integer.toString(n, 3);
        System.out.println(toThird);

        StringBuilder sb = new StringBuilder(toThird);
        return Integer.parseInt(sb.reverse().toString(), 3);
    }
}