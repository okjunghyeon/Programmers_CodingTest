package lv1.옹알이_2;

import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        String[] speak = {"aya", "ye", "woo", "ma"};
        String[] speakTwoTime = {"ayaaya", "yeye", "woowoo", "mama"};

        A:
        for(int i = 0; i < babbling.length; i++) {

            // 두번 연속으로 발음하는 경우 체크
            for(String s : speakTwoTime) {
                if(babbling[i].contains(s)) {
                    continue A;
                }
            }

            for(String s : speak) {
                // 공백으로 변환하여 단어 삭제로 인해 새로운 문자가 생성되지 않도록 주의
                babbling[i] = babbling[i].replace(s, " ");
            }
        }
        return (int) Arrays.stream(babbling).filter(String::isBlank).count();
    }
}