package lv1.덧칠하기;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution2 {
    public int solution(int n, int m, int[] section) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 1); // n을 1로 채운 배열로 만든다

        Arrays.stream(section).forEach(e -> arr[e] = 0); // section 위치는 0으로 바꾼다

        int count = 0;

        // section으로 분기한다
        A:
        for(int i = 0; i < section.length; i++) {
            if(arr[section[i]] == 1)
                continue; // 이미 칠해져있다면 넘어간다

            // 만약 구역 + m 이 범위를 초과한다면
            if(section[i] + m > arr.length) {
                if(i + 1 < section.length) { // 다음 section이 있다면 넘어가고
                    continue A;
                } else {
                    IntStream.rangeClosed(section[i] - m + 1, section[i]) // 다음 섹션이 없다면 역방향으로 m만큼 칠한다
                            .forEach(e -> arr[e] = 1);
                }
            } else {
                IntStream.rangeClosed(section[i], section[i] + m - 1) // 범위를 초과하지 않는다면 m만큼 페인트를 칠한다.
                        .forEach(e -> arr[e] = 1);
            }
            count++; // continue 하지 않고 페인트를 칠했다면 count를 증가시킨다
        }
        return count;
    }
}