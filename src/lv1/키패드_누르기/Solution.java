package lv1.키패드_누르기;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder hands = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i < 10; i++) {
            int count = (i - 1) / 3;
            map.put(i, 10 * count + (i - 1) % 3 + 1);
        }

        map.put(11, 31);
        map.put(0, 32);
        map.put(12, 33);

        int nowL = 11;
        int nowR = 12;

        for(int number : numbers) {
            if(number == 1 || number == 4 || number == 7) {
                nowL = number;
                hands.append("L");
            } else if(number == 3 || number == 6 || number == 9) {
                nowR = number;
                hands.append("R");
            } else {
                int rangeL = getDistance(nowL, number, map);
                int rangeR = getDistance(nowR, number, map);

                if(rangeL < rangeR) {
                    nowL = number;
                    hands.append("L");
                } else if(rangeL > rangeR) {
                    nowR = number;
                    hands.append("R");
                } else {
                    if(hand.equals("right")) {
                        nowR = number;
                        hands.append("R");
                    } else {
                        nowL = number;
                        hands.append("L");
                    }
                }
            }
        }

        return hands.toString();
    }
    private int getDistance(int now, int number, Map<Integer, Integer> map) {
        int x = map.get(now);
        int y = map.get(number);
        return Math.abs(x / 10 - y / 10) + Math.abs(x % 10 - y % 10);
    }
}