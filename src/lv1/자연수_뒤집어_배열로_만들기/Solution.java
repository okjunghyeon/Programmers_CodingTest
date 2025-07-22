package lv1.자연수_뒤집어_배열로_만들기;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(long n) {
        // 숫자 -> 배열로 변환
        String[] arr = String.valueOf(n).split("");

        // 배열을 정수로 변환하고 뒤집기
        List<Integer> list = Arrays.stream(arr).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

        Collections.reverse(list);

        // List<Integer>를 int[]로 변환
        return list.stream().mapToInt(i -> i).toArray();
    }
}