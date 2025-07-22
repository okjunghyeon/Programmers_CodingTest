package lv1._2016년;

import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        // 2016년 1월 1일은 금요일입니다.
        LocalDate date = LocalDate.of(2016, a, b);

        return date.getDayOfWeek().toString().substring(0,3);
    }
}