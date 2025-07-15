package lv1.명예의_전당_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();  // 명예의 전당
        List<Integer> answer = new ArrayList<>();      // 매일 발표할 최하위 점수

        for (int dailyScore : score) {
            list.add(dailyScore);  // 새로운 점수 추가

            // 오름차순 정렬
            Collections.sort(list);

            // 명예의 전당이 k개를 초과하면 가장 낮은 점수 제거
            if (list.size() > k) {
                list.remove(0);
            }

            // 현재 명예의 전당의 최하위 점수 추가
            answer.add(list.get(0));
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}