package lv1.문자열_내_p와_y의_개수;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    //    boolean solution(String s) {
//        int p = s.replaceAll("^[pP]", "").length();
//        int y = s.replaceAll("^[yY]", "").length();
//
//        return p==y;
//    }
    boolean solution(String s) {
        // 전체 소문자 변환 및 'py' 이외의 문자 제거
        String filter = s.toLowerCase().replaceAll("[^py]", "");

        // 'p'와 'y'의 개수를 세기
        int count = 0;
        for (char c : filter.toCharArray()) {
            if (c == 'p') count++;
            else count--;
        }

        return count == 0;
    }
}