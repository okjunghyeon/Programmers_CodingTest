package lv1.과일_장수;

/**
 * k	m	score	                                result
 * 3	4	[1, 2, 3, 1, 2, 3, 1]	                8
 * 4	3	[4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]	33
 */

import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 1. 오름차순 정렬
        Arrays.sort(score);

        int total = 0;

        // 2. 뒤에서 부터 m개씩 새기
        for (int i = score.length - m; i >= 0; i -= m) {
            /*
             * 오름차순 정렬이 되어있으므로 m개씩 자른 순서의 첫번째 숫자(i)가 가장 작은 수
             * 즉 i 번째 수를 m 번 곱하면 해당 박스의 금액이 나옴
             * */
            total += (score[i] * m);
        }

        return total;
    }
}