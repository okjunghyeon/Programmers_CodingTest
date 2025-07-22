package lv1.대충_만든_자판;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {

        Map<Character, Integer> map = new HashMap<>();

        // keymap을 순회하며 각 알파벳의 가장 적게 누르는 횟수를 저장함
        // ex) "BACAD" -> ('A', 2) 단 기존에 저장되어있던 'A' 횟수보다 작을 경우
        for(String s : keymap) {
            for(int i = 0; i < s.length(); i++) {
                if(i + 1 <= map.getOrDefault(s.charAt(i), 100)) {
                    map.put(s.charAt(i), i + 1);
                }
            }
        }

        int[] answer = new int[targets.length];
        A:
        for(int index = 0; index < targets.length; index++) {
            int result = 0;
            for(int i = 0; i < targets[index].length(); i++) {
                int count = map.getOrDefault(targets[index].charAt(i), -1);
                if(count < 0) {
                    answer[index] = -1; // map에 저장된 값이 없다면 -1 저장 후 다음 target으로 넘어감
                    continue A;
                }
                result += count;
            }
            answer[index] = result; // 정상적으로 반복문이 종료된 경우 answer에 결과값을 저장
        }
        return answer;
    }
}