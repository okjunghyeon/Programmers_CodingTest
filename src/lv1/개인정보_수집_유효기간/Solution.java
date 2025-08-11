package lv1.개인정보_수집_유효기간;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        Map<String, Integer> termMap = new HashMap<>();

        for(String term : terms) {
            String[] arr = term.split(" ");
            termMap.put(arr[0], Integer.parseInt(arr[1]));
        }

        today = today.replace(".", "");
        List<Integer> answer = new ArrayList<>();

        for(int index = 0; index < privacies.length; index++) {
            String[] arr = privacies[index].split(" ");
            int term = termMap.get(arr[1]);

            String[] date = arr[0].split("\\.");
            int year = Integer.parseInt(date[0]);
            int month = Integer.parseInt(date[1]);
            int day = Integer.parseInt(date[2]);

            if(day != 1) {
                day--;
            } else {
                day = 28;
                month--;
                if(month == 0) {
                    month = 12;
                    year--;
                }
            }

            for(int i = 1; i <= term; i++) {
                month++;
                if(month > 12) {
                    month = 1;
                    year++;
                }
            }
            String str = year + String.format("%02d", month) + String.format("%02d", day);

            if(str.compareTo(today) < 0) {
                answer.add(index + 1);
            }
        }
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}