package lv1.숫자_짝꿍;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class Solution {

    // 문자열을 받아 각 숫자의 개수를 세어 Map으로 반환하는 함수
    private Map<Integer, Integer> getNumberMapByStr(String str) {
        Map<Integer, Integer> map = new HashMap<>();

        // 문자열을 한 글자씩 숫자로 변환하여 개수를 셈
        for(String s : str.split("")) {
            int n = Integer.parseInt(s);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        return map;
    }

    public String solution(String X, String Y) {
        // X와 Y의 숫자 개수를 각각 Map으로 만듦
        Map<Integer, Integer> xMap = getNumberMapByStr(X);
        Map<Integer, Integer> yMap = getNumberMapByStr(Y);
        StringBuilder sb = new StringBuilder();

        // 0부터 9까지 공통으로 존재하는 숫자를 찾음
        for(int i = 0; i < 10; i++) {
            if(xMap.containsKey(i) && yMap.containsKey(i)) {
                // 공통된 개수(더 적은 쪽)만큼 숫자를 StringBuilder에 추가
                int min = Math.min(xMap.get(i), yMap.get(i));
                sb.append(String.valueOf(i).repeat(min));
            }
        }

        // 공통된 숫자가 없으면 "-1" 반환
        if(sb.length() == 0) {
            return "-1";
        }

        // 가장 큰 수를 만들기 위해 문자들을 내림차순으로 정렬
        String[] answer = sb.toString().split("");
        Arrays.sort(answer, Comparator.reverseOrder());

        // 정렬된 문자 배열을 다시 하나의 문자열로 합침
        String result = String.join("", answer);

        // 결과가 "0"으로 시작하면 "0"을, 아니면 결과 그대로 반환
        return result.startsWith("0") ? "0" : result;
    }
}
