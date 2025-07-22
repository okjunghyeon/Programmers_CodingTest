package lv1.기사단원의_무기;

class Solution2 {
    public int solution(int number, int limit, int power) {
        // 1~number 기사단원으로 분기한다
        // 기사번호의 약수의 개수를 구한다.
        // 약수의 개수가 limit를 초과할경우 power를, 초과하지않으면 약수의 개수를 result에 더한다

        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;

            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) count++;
            }

            count++;

            answer += (count > limit) ? power : count;
        }

        return answer;
    }
}