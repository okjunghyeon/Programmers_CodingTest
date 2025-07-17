package lv1.약수의_개수와_덧셈;

class Solution {
    public int solution(int left, int right) {

        int answer = 0;

        for(int i=left; i <= right; i++) {
            int count = 0;
            for(int j=1; j <= i/2; j++) {
                if(i % j == 0) {
                    count++;
                }
            }
            count++; // 자기 자신도 약수에 포함
            answer += (count % 2 == 0) ? i : -i;
        }

        return answer;
    }
}