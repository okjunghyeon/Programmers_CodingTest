package lv1.실패율;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> clears = new HashMap<>(); // 각 스테이지에 도달한 사람 수
        Map<Integer, Double> fails = new HashMap<>();  // 각 스테이지에서 실패한 사람 수

        // 도달자 수와 실패자 수 계산
        for (int stage : stages) {
            fails.put(stage, fails.getOrDefault(stage, 0.0) + 1); // 해당 스테이지에서 실패
            for (int i = 1; i <= stage; i++) {
                clears.put(i, clears.getOrDefault(i, 0.0) + 1);   // 1~stage까지 도달
            }
        }

        Map<Integer, Double> map = new HashMap<>(); // 실패율 저장

        // 각 스테이지별 실패율 계산
        for (int i = 1; i <= N; i++) {
            if (fails.getOrDefault(i, 0.0) == 0.0 || clears.getOrDefault(i, 0.0) == 0.0) {
                map.put(i, 0.0); // 실패자가 없거나 도달자가 없으면 실패율 0
            } else {
                map.put(i, fails.get(i) / clears.get(i)); // 실패율 = 실패자수/도달자수
            }
        }

        // 실패율 내림차순으로 정렬하여 스테이지 번호 배열로 반환
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}