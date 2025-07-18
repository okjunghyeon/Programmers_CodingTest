package lv1.모의고사;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] answers) {
        int[][] points = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int[] results = new int[3];

        for (int i = 0; i < answers.length; i++) { // 0,1,2 ... 문제 번호

            for (int j = 0; j < points.length; j++) { // 3명의 수포자를 순회

                // i % points[j].length: 현재 문제 번호를 수포자의 패턴 길이로 나눈 나머지
                //                       → 현재 문제에 해당하는 수포자의 찍기 순서
                if (points[j][i % points[j].length] == answers[i]) { // j번째 수포자가 i번째 문제에서 찍은 답이 맞았다면
                    results[j]++;
                }
            }
        }

        int max = Arrays.stream(results).max().orElse(-1); // 맞춘 개수 중에서 최대값 구하기

        return IntStream.rangeClosed(1, 3)
                .filter(e -> results[e - 1] == max)
                .toArray();
    }
}