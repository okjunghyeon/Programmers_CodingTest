package lv1.덧칠하기;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int n, int m, int[] section) {
        boolean[] painted = new boolean[n + 1];

        Arrays.fill(painted, true); // n을 1로 채운 배열로 만든다
        for (int s : section) { // section 위치는 0으로 바꾼다
            painted[s] = false;
        }

        int count = 0;

        // section으로 분기한다
        for (int i = 0; i < section.length; i++) {
            if (painted[section[i]]) continue; // 이미 칠해져있다면 넘어간다

            int start, end;
            if (section[i] + m > painted.length) { // 만약 구역 + m 이 범위를 초과한다면
                if (i + 1 < section.length) continue; // 다음 section이 있다면 넘어가고
                start = section[i] - m + 1;
                end = section[i]; // 끝에서 부터 역순으로 칠함
            } else {
                start = section[i];
                end = section[i] + m - 1;
            }
            IntStream.rangeClosed(start, end).forEach(e -> painted[e] = true);
            count++;
        }

        return count;
    }
}