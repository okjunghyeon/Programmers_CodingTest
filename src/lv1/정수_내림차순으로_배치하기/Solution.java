package lv1.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public long solution(long n) {
        // 숫자를 문자열로 변환하고 각 자리수를 분리
        String[] arr = String.valueOf(n).split("");

        // 각 자리수를 정수로 변환하고 내림차순으로 정렬
        Arrays.sort(arr, Comparator.reverseOrder());

        // 정렬된 문자열 배열을 다시 하나의 문자열로 합치고, 이를 long 타입으로 변환
        return Long.parseLong(String.join("", arr));
    }
}