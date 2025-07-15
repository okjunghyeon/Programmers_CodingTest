package lv1.K번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// commands 별로 분기한다. (i j k)
// i ~ j 번째 배열로 잘라낸다.
// 잘라낸 배열을 오름차순 정렬한다.
// k 번째 원소를 찾아 answer에 저장한다.

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        for (int[] command : commands) {
            int i = command[0] - 1; // index로 변환하기 위해 각각 -1 적용
            int j = command[1] - 1;
            int k = command[2] - 1;

            int[] arr = Arrays.copyOfRange(array, i, j+1);
            Arrays.sort(arr);

            answer.add(arr[k]);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}