package lv1.문자열_내_마음대로_정렬하기;

import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {

       return Arrays.stream(strings)
                .map(e -> e.charAt(n) + e)
                .sorted()
                .map(equals -> equals.substring(1))
                .toArray(String[]::new);

    }
}