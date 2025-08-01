package lv1.성격_유형_검사하기;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    private int numberToPoint(int number) {
        return switch(number) {
            case 1 -> 3;
            case 2 -> 2;
            case 3 -> 1;
            case 4 -> 0;
            case 5 -> 1;
            case 6 -> 2;
            case 7 -> 3;
            default -> -1;
        };
    }

    public String solution(String[] survey, int[] choices) {

        Map<Character, Integer> scoreMap = new HashMap<>();
        for(int index = 0; index < survey.length; index++) {

            int choice = choices[index];
            if(choice == 4) {
                continue;
            }

            char c = choice < 4 ? survey[index].charAt(0) : survey[index].charAt(1);
            scoreMap.put(c, scoreMap.getOrDefault(c, 0) + numberToPoint(choice));
        }

        char[][] mbtis = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        StringBuilder sb = new StringBuilder();

        for(char[] mbti : mbtis) {
            int x = scoreMap.getOrDefault(mbti[0], 0);
            int y = scoreMap.getOrDefault(mbti[1], 0);

            if(x == y) {
                Arrays.sort(mbti);
                sb.append(mbti[0]);
            } else {
                char c = x > y ? mbti[0] : mbti[1];
                sb.append(c);
            }
        }

        return sb.toString();
    }
}