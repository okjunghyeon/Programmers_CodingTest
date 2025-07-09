package lv1.가운데_글자_가져오기;

class Solution {
    public String solution(String s) {
        // 홀수면 length / 2 가져오면 됨
        // 짝수면 length / 2 - 1, length / 2 가져오면 됨

        int mid = s.length() / 2;

        return s.length() % 2 == 0
                ? s.substring(mid - 1, mid + 1)
                : s.substring(mid, mid + 1);
    }
}