package lv1.문자열_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//class Solution {
//    public String solution(String s) {
//        String[] arr = s.split("");
//        Arrays.sort(arr, Comparator.reverseOrder());
//
//        return String.join("", arr);
//        // or return Arrays.stream(arr).collect(Collectors.joining());
//    }
//}
class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr));

        return sb.reverse().toString();
    }
}