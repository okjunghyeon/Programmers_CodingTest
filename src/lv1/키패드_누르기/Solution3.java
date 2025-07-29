package lv1.키패드_누르기;

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i < 10; i++) {
            int row = (i - 1) / 3;
            int col = (i - 1) % 3;
            map.put(i, row * 10 + col);
        }
        map.put(0, 31);   // 0의 좌표
        map.put(11, 30);  // *의 좌표
        map.put(12, 32);  // #의 좌표

        int nowL = 11;
        int nowR = 12;

        for(int number : numbers) {
            char handToUse = switch(number) {
                case 1, 4, 7 -> 'L';
                case 3, 6, 9 -> 'R';
                default -> {
                    int rangeL = getDistance(nowL, number, map);
                    int rangeR = getDistance(nowR, number, map);

                    if(rangeL < rangeR) {
                        yield 'L';
                    } else if(rangeR < rangeL) {
                        yield 'R';
                    } else {
                        yield (hand.equals("right")) ? 'R' : 'L';
                    }
                }
            };

            if (handToUse == 'L') {
                nowL = number;
                answer.append('L');
            } else {
                nowR = number;
                answer.append('R');
            }
        }

        return answer.toString();
    }

    // 두 키패드 위치 간의 거리를 계산하는 메소드
    private int getDistance(int now, int number, Map<Integer, Integer> map) {
        int x = map.get(now);
        int y = map.get(number);
        return Math.abs(x / 10 - y / 10) + Math.abs(x % 10 - y % 10);
    }
}