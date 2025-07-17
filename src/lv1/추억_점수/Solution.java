package lv1.추억_점수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 이름과 그리움 점수를 매핑하는 맵 생성
        Map<String,Integer> map = new HashMap<>();

        // 이름 배열을 순회하며 맵에 이름과 그리움 점수 저장
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        // 결과를 저장할 리스트
        ArrayList<Integer> answer = new ArrayList<>();

        // 각 사진에 대해 그리움 점수 계산
        for (String[] arr : photo) {
            // 사진 속 인물들의 그리움 점수 합계 계산
            int total = Arrays.stream(arr)
                    .mapToInt(e -> map.getOrDefault(e, 0)) // 맵에 없으면 0점
                    .sum();

            answer.add(total);
        }

        // ArrayList를 int 배열로 변환하여 반환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}