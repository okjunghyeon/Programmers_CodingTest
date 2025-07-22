package lv1.옹알이_2;

import java.util.Arrays;

class Solution3 {
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

            while(true) {
                String match = Arrays.stream(speak).filter(babbling[i]::startsWith).findFirst().orElse("");

                if(match.isEmpty()) {
                    break;
                }

                babbling[i] = babbling[i].substring(match.length());
            }
        }
        return (int) Arrays.stream(babbling).filter(String::isEmpty).count();
    }
}