package lv1.개인정보_수집_유효기간;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2 {
    public int[] solution(String today, String[] terms, String[] privacies) {

        Map<String, Integer> termMap = new HashMap<>();

        for(String term : terms) {
            String[] arr = term.split(" ");
            int day = Integer.parseInt(arr[1]);
            termMap.put(arr[0], day);
        }

        List<Integer> answer = new ArrayList<>();
        int now = getDate(today);

        for(int index = 0; index < privacies.length; index++) {
            String[] arr = privacies[index].split(" ");

            int priv = getDate(arr[0]);
            int term = termMap.get(arr[1]);

            if(now >= priv + term * 28) {
                answer.add(index + 1);
            }
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private int getDate(String date) {
        String[] arr = date.split("\\.");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        return (year * 12 * 28) + (month * 28) + day;
    }
}