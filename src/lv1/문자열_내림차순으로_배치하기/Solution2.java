package lv1.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;

class Solution2 {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        return String.join("", arr);
        // or return Arrays.stream(arr).collect(Collectors.joining());
    }
}