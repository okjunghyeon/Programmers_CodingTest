package lv1.이상한_문자_만들기;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(String s) {
        // 문자열 공백으로 분리
        String[] arr = s.split(" ", -1);

        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (String str : arr) {
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(str.charAt(i)));
                }
            }
            list.add(sb.toString());
            sb.setLength(0);
        }
        return String.join(" ", list);
    }
}