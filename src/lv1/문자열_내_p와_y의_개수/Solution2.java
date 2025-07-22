package lv1.문자열_내_p와_y의_개수;

public class Solution2 {
    boolean solution(String s) {
        int p = s.replaceAll("^[pP]", "").length();
        int y = s.replaceAll("^[yY]", "").length();

        return p == y;
    }
}