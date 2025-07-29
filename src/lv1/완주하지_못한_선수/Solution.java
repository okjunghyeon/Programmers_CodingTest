package lv1.완주하지_못한_선수;

// 1. map에 담고 하나씩 차감한다?
// 마지막 남은애는 어떻게 찾게

// 2. 그냥 set에 넣는다?
// 중복이 사라져버림

// 3. 1명 적은 completion을 맵에 집어넣는다 <String, Integer>
// participant를 순차적으로 제거하는데 만약 map에 존재하지않으면 해당 이름을 반환한다

//  participant	                                        completion	                                return
//  ["leo", "kiki", "eden"]	                            ["eden", "kiki"]	                        "leo"
//  ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
//  ["mislav", "stanko", "mislav", "ana"]	            ["stanko", "ana", "mislav"]	                "mislav"

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for(String player : completion) {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }

        for(String player : participant) {
            int count = map.getOrDefault(player, -1);

            if(count < 1) {
                return player;
            } else {
                map.put(player, count - 1);
            }
        }

        return ""; // 반복문을 통해 미완주자를 못찾는 경우는 존재하지 않음
    }
}